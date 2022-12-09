import java.lang.Thread;
public class Player {

    // level default is set to 1
    int level = 1;
    static int type, strength, health, levelxp, specialMoveStrength;
    static String specialMove, name;

    // construcor of all attributes of the player
    public Player(int type, int strength, int health, String specialMove, String name, int specialMoveStrength) {
        Player.type = type;
        Player.strength = strength;
        Player.health = health;
        Player.specialMove = specialMove;
        Player.name = name;
        Player.specialMoveStrength = specialMoveStrength;
        return;
    }

    // prints out all the stats of Player
    public void getStats () {
        System.out.println("----==-< " + name + "'s Stats >-==----");
        System.out.println("Type: " + type);
        System.out.println("Strength: " + strength);
        System.out.println("Health: " + health);
        System.out.println("Special Move: " + specialMove);
        System.out.println("Level: " + level + " (" + (levelxp) + "/100 until next Level)");
        
        // delay to make it visible for longer
        try {
            Thread.sleep(3000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return;
    }

    // method for leveling up and collecting xp
    public void levelUp (int xp) {
        levelxp = levelxp + xp;
        // 100 is the threshhold for reaching the next level
        if (levelxp >= 100) {
            this.level++;

            levelxp = levelxp%100;
        }
        return;
    }

    // Upgrades Strength by one
    public void upgradeStrength () {
        Player.strength++;
        return;
    }

    // Upgrades Health by two
    public void upgradeHealth () {
        Player.health+=2;
        return;
    }

    // changes name
    public void changeName (String newName) {
        Player.name = newName;
        return;
    }

    // Upgrades special ability
    public void upgradeSpecialMoveStrength () {
        Player.specialMoveStrength += 5;
    }

}
