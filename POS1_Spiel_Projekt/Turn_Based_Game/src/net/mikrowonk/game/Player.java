package net.mikrowonk.game;

import java.lang.Thread;
public class Player extends Entity {

    // level default is set to 1
    private int specialMoveStrength;
    private int level;
    private int levelXp;
    private String specialMove;

    public Player() {

    }

    // constructor of all attributes of the player
    public Player(int strength, int health, String specialMove, String name, int specialMoveStrength) {
        super(strength, health, name);
        this.specialMove = specialMove;
        this.specialMoveStrength = specialMoveStrength;

        if (Starting.savingChoice == 2) {
            this.levelXp = Starting.levelXp;
            this.level = Starting.level;
        }
        else {
            this.levelXp = 0;
            this.level = 1;
        }
    }

    // prints out all the stats of Player
    @Override
    public void showStats() {
        System.out.println("----==-< " + this.name + "'s Stats >-==----");
        System.out.println("Strength: " + this.strength);
        System.out.println("Health: " + this.health);
        System.out.println("Special Move: " + this.specialMove);
        System.out.println("Level: " + this.level + " (" + (this.levelXp) + "/100 until next Level)");

        // delay to make it visible for longer
        try {
            Thread.sleep(2000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    // method for leveling up and collecting xp
    public void levelUp (int xp) {
        this.levelXp = this.levelXp + xp;

        if (this.levelXp < 0) {
            this.levelXp = 0;
        }
        
        // 100 is the threshold for reaching the next level
        if (this.levelXp >= 100) {
            this.level++;

            this.levelXp = this.levelXp %100;
        }
    }

    // Upgrades Strength by one
    public void upgradeStrength () {
        this.strength++;
    }

    // Upgrades Health by two
    public void upgradeHealth () {
        this.health+=2;
    }

    // changes name
    public void changeName (String newName) {
        this.name = newName;
    }

    // Upgrades special ability
    public void upgradeSpecialMoveStrength () {
        this.specialMoveStrength += 5;
    }


    public int getLevel() {
        return level;
    }

    public int getLevelXp() {
        return levelXp;
    }

    public int getSpecialMoveStrength() {
        return specialMoveStrength;
    }

    public String getName() {
        return name;
    }

    public String getSpecialMove() {
        return specialMove;
    }

    public void setLevelXp(int levelXp) {
        this.levelXp = levelXp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setSpecialMove(String specialMove) {
        this.specialMove = specialMove;
    }

    public void setSpecialMoveStrength(int specialMoveStrength) {
        this.specialMoveStrength = specialMoveStrength;
    }
}
