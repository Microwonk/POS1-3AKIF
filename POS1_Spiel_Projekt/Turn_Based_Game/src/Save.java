import java.io.PrintWriter;
import java.io.IOException;

public class Save {

    static Player player = Menu.player;

    public static void saving () throws IOException {
        PrintWriter out = new PrintWriter("Save.txt");

        out.print(player.type + " ");
        out.print(player.strength + " ");
        out.print(player.health + " ");
        out.print(player.specialMove + " ");
        out.print(player.name + " ");
        out.print(player.specialMoveStrength + " ");
        out.print(player.level + " ");
        out.print(player.levelxp);
        
        out.close();
    }
}