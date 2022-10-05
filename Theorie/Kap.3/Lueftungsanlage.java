import java.util.Scanner;

public class Lueftungsanlage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int temp, luft;

        System.out.println("Geben Sie die Temparatur ein:");
            temp = s.nextInt();
        System.out.println("Geben Sie die Luftfeuchtigkeit ein:");
            luft = s.nextInt();

        if ((luft>0&&luft<=100)&&(temp>=-100&&temp<=70)) {
            
            if ((temp<12||temp>24&&temp<50)||(luft>65)) {
                System.out.println("Der Luefter wird aktiviert.");
            }
            else {
                System.out.println("Der Luefter wird nicht aktiviert.");
            }
        }
        else {
            System.out.println("Bitte geben Sie realistische Werte ein!");
        }
    }
}