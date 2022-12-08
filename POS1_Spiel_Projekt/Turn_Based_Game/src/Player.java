import java.lang.Thread;
public class Player {

    int level = 1;
    static int type, strength, stamina, health, levelxp;
    static String specialMove1, specialMove2, name;

    public Player(int type, int strength, int stamina, int health, String specialMove1, String name) {
        Player.type = type;
        Player.strength = strength;
        Player.stamina = stamina;
        Player.health = health;
        Player.specialMove1 = specialMove1;
        Player.name = name;
        return;
    }

    public void getStats () {
        System.out.println("----==-< " + name + "'s Stats >-==----");
        System.out.println("Type: " + type);
        System.out.println("Strength: " + strength);
        System.out.println("Stamina: " + stamina);
        System.out.println("Health: " + health);
        System.out.println("Special Move: " + specialMove1);
        System.out.println("Level: " + level + " (" + (levelxp) + "/100 until next Level)");
        
        try {
            Thread.sleep(3000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return;
    }

    public void levelUp (int xp) {
        levelxp = levelxp + xp;
        // 100 is the threshhold for reaching the next level
        if (levelxp >= 100) {
            this.level++;

            levelxp = levelxp%100;
        }
        return;
    }

    public final int SPECIALMOVESTRENGTH = Player.strength * 2;

    public void upgradeStrength () {
        Player.strength++;
        return;
    }

    public void upgradeHealth () {
        Player.health+=2;
        return;
    }

    public void upgradeStamina () {
        Player.stamina+=5;
        return;
    }

    public void changeName (String newName) {
        Player.name = newName;
        return;
    }

}
