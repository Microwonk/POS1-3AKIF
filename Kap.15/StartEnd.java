import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start, end;

        System.out.println("Startwert:");
            start = s.nextInt();
        System.out.println("Endwert:");
            end = s.nextInt();
        System.out.println();

        while (start<=end) {
            System.out.println(start);
            start = start+1;
        }
    }
}