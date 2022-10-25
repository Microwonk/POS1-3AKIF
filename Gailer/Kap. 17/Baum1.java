import java.util.Scanner;

public class Baum1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String star = "*";

        System.out.print("Höhe: ");
        int height = scan.nextInt() - 1;

        for (int i = 0; i < height; i++) {
            if (i == 0) {
                for (int z = 0; height > z; z++) {
                    System.out.print(" ");
                }
                System.out.print(star);
                System.out.println();
            }

            for (int j = 0; j < height - i - 1 ; j++) {
                System.out.print(" ");
            }

            star = star + "**";
            System.out.print(star);
            System.out.println();
        }

        for (int i = 1; i < height; i++) {
            System.out.print(" ");
        }
        System.out.println("|||");

    }
}
