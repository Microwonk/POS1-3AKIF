package net.mikrowonk.connect_4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many lines should your Board have?");
        int lines = scan.nextInt();
        System.out.println("How many columns should your Board have?");
        int columns = scan.nextInt();
        Game game = new Game(lines, columns);
        game.startGame();
    }
}