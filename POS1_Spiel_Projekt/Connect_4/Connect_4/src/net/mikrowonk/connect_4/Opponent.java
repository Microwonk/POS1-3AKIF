package net.mikrowonk.connect_4;

public class Opponent {

    private boolean difficulty;
    public Opponent(boolean difficulty) {
        this.difficulty = difficulty;
       }

    public void makeNextMove(Board board) {
        // Check for winning moves
        for (int i = 0; i < board.getColumns(); i++) {
            if (board.getCoinsPutPerColumn(i) < board.getLines() - 3) {
                // Check for three consecutive coins in a row
                if (board.getBoardMatrix()[board.getCoinsPutPerColumn(i)][i].equals("E") &&
                        board.getBoardMatrix()[board.getCoinsPutPerColumn(i) + 1][i].equals("E") &&
                        board.getBoardMatrix()[board.getCoinsPutPerColumn(i) + 2][i].equals("E")) {
                    // Place fourth coin to win the game
                    board.decideMove(false, i);
                    return;
                }
            }
        }

        // Check for opportunities to block player from winning
        for (int i = 0; i < board.getColumns(); i++) {
            if (board.getCoinsPutPerColumn(i) < board.getLines() - 3) {
                // Check for three consecutive coins in a row belonging to the player
                if (board.getBoardMatrix()[board.getCoinsPutPerColumn(i)][i].equals("P") &&
                        board.getBoardMatrix()[board.getCoinsPutPerColumn(i) + 1][i].equals("P") &&
                        board.getBoardMatrix()[board.getCoinsPutPerColumn(i) + 2][i].equals("P")) {
                    // Place coin to block player from winning
                    board.decideMove(false, i);
                    return;
                }
            }
        }

        // Place coin in strategic location to create opportunities to win
        for (int i = 0; i < board.getColumns(); i++) {
            if (board.getCoinsPutPerColumn(i) < board.getLines() - 3) {
                // Check for two consecutive coins in a row
                if (board.getBoardMatrix()[board.getCoinsPutPerColumn(i)][i].equals("E") &&
                        board.getBoardMatrix()[board.getCoinsPutPerColumn(i) + 1][i].equals("E")) {
                    // Place third coin to create opportunity to win
                    board.decideMove(false, i);
                    return;
                }
            }
        }

        // If no winning or blocking moves are available, place coin in first available space
        for (int i = 0; i < board.getColumns(); i++) {
            if (board.getCoinsPutPerColumn(i) < board.getLines()) {
                board.decideMove(false, i);
                return;
            }
        }
    }
}
