package net.mikrowonk.connect_4_arrays;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final int lines;
    private final int columns;
    private final List<Line> boardLines;


    public Board(int lines, int columns) {
        this.lines = lines;
        this.columns = columns;
        this.boardLines = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            boardLines.add(new Line("o", columns));
        }

    }

    public void showBoard() {
        for (Line line : boardLines) {
            line.showLine();
        }
    }

    public void doMove(String moveSign, int line, int column) {
        this.boardLines.get(line).setColumn(column, moveSign);
    }

    public void decideMove(boolean isPlayer, int column) {
        String moveSign;
        String signAtIndex;
        if (isPlayer) {
            moveSign = "P"; // Player
        } else {
            moveSign = "E"; // Enemy
        }
        for (int line = 0; line < this.lines - 1; line++) {
            doMove(moveSign, line, column);
        }
        int line = 0;
        for (Column columns : this.boardLines.get(line).lineColumns) {
            if (!columns.getSign().equals("o")) {
                columns.setSign("o");
            } else {
                columns.setSign(moveSign);
            }
        }
        line++;
    }
}