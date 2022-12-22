package net.mikrowonk.connect_4;

import java.util.ArrayList;
import java.util.Arrays;
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
        for (Line line: boardLines) {
            line.showLine();
        }
    }

    public void doMove(String moveSign, int line, int column) {
        this.boardLines.get(line).setColumn(column, moveSign);
    }

    public void decideMove (boolean isPlayer, int column) {
        String moveSign;
        String signAtIndex;
        if (isPlayer) {
            moveSign = "P"; // Player
        }
        else {
            moveSign = "E"; // Enemy
        }
        for (int line = 0; line < this.lines - 1; line++) {
            signAtIndex = this.boardLines.get(line).getLineColumns().get(column).getSign();
            if (line == 0 && !(signAtIndex.equals("E") || signAtIndex.equals(("P")))) {

            }
        }
    }
}
