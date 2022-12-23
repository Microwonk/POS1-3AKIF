package net.mikrowonk.connect_4;

import java.util.Random;

public class Opponent {
    private Board board;

    public Opponent(Board board) {
        this.board = board;
    }

    public int checkForWinning() {
        Board b;
        // Check for winning Enemy moves
        for (int i = 0; i < board.getColumns(); i++) {
            b = this.board;
            b.decideMove(false, i);
            if (b.hasWon("E")) {
                b.undoMove(i);
                return i;
            }
            b.undoMove(i);
        }
        return -1;
    }

    public int checkForLosing() {
        Board b;
        for (int i = 0; i < board.getColumns(); i++) {
            b = this.board;
            b.decideMove(true, i);
            if (b.hasWon("P")) {
                b.undoMove(i);
                return i;
            }
            b.undoMove(i);
        }
        return -1;
    }
    public int randomMove() {
        Random rand = new Random();
        int move = rand.nextInt(0, board.getColumns());
        while (true) {
            if (board.getCoinsPutPerColumn(move) < board.columns) {
                break;
            }
            else move = rand.nextInt(0, board.getColumns());
        }
        return move;
    }
}
