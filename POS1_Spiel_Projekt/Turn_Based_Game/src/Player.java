import java.lang.Thread;
public class Player {

    // level default is set to 1
    int type, strength, health, specialMoveStrength, level, levelxp;
    String specialMove, name;

    // construcor of all attributes of the player
    public Player(int type, int strength, int health, String specialMove, String name, int specialMoveStrength) {
        this.type = type;
        this.strength = strength;
        this.health = health;
        this.specialMove = specialMove;
        this.name = name;
        this.specialMoveStrength = specialMoveStrength;

        if (Starting.savingChoice == 2) {
            this.levelxp = Starting.levelxp;
            this.level = Starting.level;
        }
        else {
            this.levelxp = 0;
            this.level = 1;
        }
        return;
    }

    // prints out all the stats of Player
    public void getStats () {
        System.out.println("----==-< " + this.name + "'s Stats >-==----");
        System.out.println("Type: " + this.type);
        System.out.println("Strength: " + this.strength);
        System.out.println("Health: " + this.health);
        System.out.println("Special Move: " + this.specialMove);
        System.out.println("Level: " + this.level + " (" + (this.levelxp) + "/100 until next Level)");
        
        // delay to make it visible for longer
        try {
            Thread.sleep(2000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return;
    }

    // method for leveling up and collecting xp
    public void levelUp (int xp) {
        this.levelxp = this.levelxp + xp;

        if (this.levelxp < 0) {
            this.levelxp = 0;
        }
        
        // 100 is the threshhold for reaching the next level
        if (this.levelxp >= 100) {
            this.level++;

            this.levelxp = this.levelxp%100;
        }
        return;
    }

    // Upgrades Strength by one
    public void upgradeStrength () {
        this.strength++;
        return;
    }

    // Upgrades Health by two
    public void upgradeHealth () {
        this.health+=2;
        return;
    }

    // changes name
    public void changeName (String newName) {
        this.name = newName;
        return;
    }

    // Upgrades special ability
    public void upgradeSpecialMoveStrength () {
        this.specialMoveStrength += 5;
    }

}
