package net.mikrowonk.connect_4;

import java.util.Scanner;

public class Game {
    public Board board;
    public Game() {
        board = new Board(6, 6);
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
            Opponent opp = new Opponent(true);
            opp.makeNextMove(board);
            if (board.hasWon("E")){
                board.showBoard();
                System.out.println("You lost!");
                return;
            }
            board.showBoard();
        }
    }
}