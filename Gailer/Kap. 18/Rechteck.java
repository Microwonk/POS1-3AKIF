import java.util.Scanner;

public class Rechteck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputx1, inputy1, inputx2, inputy2;
        int height = 1, length = 1, area = 1;

        System.out.println("CAD Programm");

        while (area != 0 || length != 0 || height != 0) {
            System.out.println("Erster Eckpunkt X:");
            inputx1 = scan.nextInt();
            System.out.println("Erster Eckpunkt Y:");
            inputy1 = scan.nextInt();
            System.out.println("Zweiter Eckpunkt X:");
            inputx2 = scan.nextInt();
            System.out.println("Zweiter Eckpunkt Y:");
            inputy2 = scan.nextInt();

            if (inputx1 >= inputx2) {
                length = inputx1 - inputx2;
            }
            else {
                length = inputx2 - inputx1;
            }

            if (inputy1 >= inputy2) {
                height = inputy1 - inputy2;
            }
            else {
                height = inputy2 - inputy1;
            }

            area = height * length;

            System.out.println();
            System.out.println("Breite: " + length);
            System.out.println("Höhe: " + height);
            System.out.println("Fläche: " + area);
        }
        scan.close();
    }
}