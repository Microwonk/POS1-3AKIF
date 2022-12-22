package net.mikrowonk.connect_4;

import java.util.Scanner;

public class Game {
    public Game() {

    }
    public void startGame() {
        Board board = new Board(6, 7);
        Scanner scan = new Scanner(System.in);
        int columnIndex;
        while (true) {
            board.showBoard();
            System.out.println("Column eingeben: ");
            columnIndex = scan.nextInt() - 1;
            board.decideMove(true, columnIndex);
        }
    }
}
