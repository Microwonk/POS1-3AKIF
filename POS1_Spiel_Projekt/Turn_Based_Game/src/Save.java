import java.io.PrintWriter;
import java.io.IOException;

public class Save {

    public static int type, strength, health, levelxp, specialMoveStrength, level;
    public static String specialMove, name;

    static Player player = Menu.player;

    public static void saving () throws IOException {
        PrintWriter out = new PrintWriter("Save.txt");

        out.print(player.type);
        out.print(" ");
        out.print(player.strength);
        out.print(" ");
        out.print(player.health);
        out.print(" ");
        out.print(player.specialMove);
        out.print(" ");
        out.print(player.name);
        out.print(" ");
        out.print(player.specialMoveStrength);
        out.print(" ");
        out.print(player.level);
        out.print(" ");
        out.print(player.levelxp);
        
        out.close();
    }
}