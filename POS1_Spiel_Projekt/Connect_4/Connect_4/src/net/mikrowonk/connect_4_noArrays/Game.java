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
            System.out.println("Column eingeben: ");
            columnIndex = scan.nextInt();
            board.dropCoin("P", columnIndex);
            if (board.checkForWin("P")) {
                board.showBoard();
                System.out.println("You Won!");
                //return;
            }

        }
    }
}