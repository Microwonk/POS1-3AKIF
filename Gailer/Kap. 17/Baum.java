import java.util.Scanner;

public class Baum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tree = "*";
        int treeinput, spaces;

        System.out.print("Geben sie die Größe des Baumes ein: ");
        treeinput = scan.nextInt() - 1;
        spaces = 0;

        //Absolute Baumkrone

        System.out.println();

        while (spaces <= treeinput) {
            System.out.print(" ");
            spaces++;

            if (spaces == treeinput) {
                System.out.print(tree);
            }
        }
        System.out.println();
        spaces = 1;

        //Rest des Baumes

        for (int line = 0; treeinput > line; line++) {


            for (int space = 0; space < treeinput - line -1 ; space++) {
                System.out.print(" ");
            }

            tree = tree + "**";
            System.out.print(tree);
            System.out.println();
        }

        //Baumstamm determination

        if (treeinput < 4) {
            while (spaces <= treeinput) {
                System.out.print(" ");
                spaces++;
            }
            System.out.print("|");
        }

        else if (treeinput > 10) {
            while (spaces < treeinput) {
                System.out.print(" ");
                spaces++;
            }
            System.out.print("|||");

            spaces = 1;
            System.out.println();

            while (spaces < treeinput) {
                System.out.print(" ");
                spaces++;
            }
            System.out.print("|||");
        }
        
        else {
            while (spaces < treeinput) {
                System.out.print(" ");
                spaces++;
            }
            System.out.print("|||");
        }
        System.out.println();

        scan.close();
    }
}