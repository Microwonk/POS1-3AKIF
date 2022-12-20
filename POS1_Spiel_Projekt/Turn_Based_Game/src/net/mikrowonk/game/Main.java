package net.mikrowonk.game;

import java.util.Random;

public class Main {

    public static Random r = new Random();
    public static Player player;

    public static void main(String[] args) {
        player = Starting.Selection();
        Core core = new Core();
        core.showMenu();
    }
}