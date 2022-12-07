
public class Player {

    static int type, strength, stamina, health;
    static String specialMove1, specialMove2, name;
    public Player(int type, int strength, int stamina, int health, String specialMove1, String specialMove2, String name) {
        Player.type = type;
        Player.strength = strength;
        Player.stamina = stamina;
        Player.health = health;
        Player.specialMove1 = specialMove1;
        Player.specialMove2 = specialMove2;
        Player.name = name;
        return;
    }

    public void getStats () {
        System.out.println("Your name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Strength: " + strength);
        System.out.println("Stamina: " + stamina);
        System.out.println("Health: " + health);
        System.out.println("Special Moves: " + specialMove1 + ", " + specialMove2);
        return;
    }

}
