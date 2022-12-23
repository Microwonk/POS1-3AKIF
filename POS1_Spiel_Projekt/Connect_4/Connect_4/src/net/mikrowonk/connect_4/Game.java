package net.mikrowonk.connect_4;

import java.util.Scanner;

public class Game {
    private Board board;
    public Game(int lines, int columns) {
        board = new Board(lines, columns);
    }

    public void startGame() {

        Scanner scan = new Scanner(System.in);
        int columnIndex;
        board.showBoard();
        while (true) {
            while (true) {
                System.out.println("Column eingeben: ");
                columnIndex = scan.nextInt() - 1;
                if (board.getCoinsPutPerColumn(columnIndex) == board.getLines()) {
                    System.out.println("Column full, try another one.");
                }
                else break;
            }
            board.decideMove(true, columnIndex);
            if (board.hasWon("P")) {
                board.showBoard();
                System.out.println("You won!");
                return;
            }
            Opponent opp = new Opponent(this.board);
            if (opp.checkForLosing() != -1) {
                board.decideMove(false, opp.checkForLosing());
            }
            if (opp.checkForWinning() != -1) {
                board.decideMove(false, opp.checkForWinning());
            }
            else {
                board.decideMove(false, opp.randomMove());
            }
            if (board.hasWon("E")){
                board.showBoard();
                System.out.println("You lost!");
                return;
            }
            board.showBoard();
        }
    }
}