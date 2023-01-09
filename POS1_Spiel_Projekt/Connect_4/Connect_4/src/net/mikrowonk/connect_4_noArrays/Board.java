package net.mikrowonk.connect_4_noArrays;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final int columns;
    private final int lines;
    private List<Field> boardMatrix;

    public Board(int columns, int lines) {
        this.lines = lines;
        this.columns = columns;
        this.boardMatrix = new ArrayList<>();
        int countLines = this.lines;
        for (int i = 0; i < columns * lines; i++) {
            this.boardMatrix.add(new Field(countLines, (int)(i % columns), "o", false));
            if (i % columns == 0) {
                countLines--;
            }
        }
    }

    public void showBoard() {
        for (Field field : boardMatrix) {
            if (field.getColumn() % this.columns == 0) {
                System.out.println();
            }
            System.out.print(field.getSign() + " ");
        }
        System.out.println();
    }

    public void dropCoin(String sign, int column) {
        for (int i = this.boardMatrix.size() - 1; i >= 0; i--) {
            if (this.boardMatrix.get(i).getColumn() == column - 1) {
                if (!this.boardMatrix.get(i).getFilled()) {
                    this.boardMatrix.get(i).setSign(sign);
                    this.boardMatrix.get(i).setFilled(true);
                    return;
                }
            }
        }
    }

    public boolean checkForWin(String sign) {
        // Check for horizontal win
        for (int i = 0; i < lines; i++) {
            int count = 0;
            for (int j = 0; j < columns; j++) {
                if (boardMatrix.get(i * columns + j).getSign().equals(sign)) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        // Check for vertical win
        for (int i = 0; i < columns; i++) {
            int count = 0;
            for (int j = 0; j < lines; j++) {
                if (boardMatrix.get(j * columns + i).getSign().equals(sign)) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        // Check for diagonal win (top-left to bottom-right)
        for (int i = 0; i < columns - 3; i++) {
            for (int j = 0; j < lines - 3; j++) {
                if (boardMatrix.get(j * columns + i).getSign().equals(sign)
                        && boardMatrix.get((j + 1) * columns + (i + 1)).getSign().equals(sign)
                        && boardMatrix.get((j + 2) * columns + (i + 2)).getSign().equals(sign)
                        && boardMatrix.get((j + 3) * columns + (i + 3)).getSign().equals(sign)) {
                    return true;
                }
            }
        }

        // Check for diagonal win (bottom-left to top-right)
        for (int i = 0; i < columns - 3; i++) {
            for (int j = lines - 1; j >= 3; j--) {
                if (boardMatrix.get(j * columns + i).getSign().equals(sign)
                        && boardMatrix.get((j - 1) * columns + (i + 1)).getSign().equals(sign)
                        && boardMatrix.get((j - 2) * columns + (i + 2)).getSign().equals(sign)
                        && boardMatrix.get((j - 3) * columns + (i + 3)).getSign().equals(sign)) {
                    return true;
                }
            }
        }

        // No win found
        return false;
    }
}