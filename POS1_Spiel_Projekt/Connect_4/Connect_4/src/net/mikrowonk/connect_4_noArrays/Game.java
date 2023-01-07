package net.mikrowonk.connect_4_noArrays;

import java.util.Scanner;

public class Game {
    private Board board;

    public Game() {

    }

    public void startGame() {
        Board board = new Board(7, 6);
        Scanner scan = new Scanner(System.in);
        int columnIndex;
        while (true) {
            board.showBoard();
            System.out.println("P: Column eingeben: ");
            columnIndex = scan.nextInt();
            board.dropCoin("P", columnIndex);
            if (board.checkForWin("P")) {
                board.showBoard();
                System.out.println("P Won!");
                return;
            }
            board.showBoard();
            System.out.println("E: Columns eingeben:");
            columnIndex = scan.nextInt();
            board.dropCoin("E", columnIndex);
            if (board.checkForWin(("E"))) {
                board.showBoard();
                System.out.println("E Won!");
                return;
            }
        }
    }
}