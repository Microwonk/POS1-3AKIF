import java.util.Scanner;

public class Hanoi {
    public static void main (String[] args) {
    
        System.out.println("Eingabe der insgesamten Scheiben: ");
        int n = new Scanner(System.in).nextInt();
        
        double before = System.currentTimeMillis();

        Hanoi h = new Hanoi();
        
        h.transport(n, 'L', 'M', 'R');

        double after = System.currentTimeMillis();

        int moves = (int)Math.pow(2, n) - 1;
        
        System.out.println("Anzahl der Züge: " +  moves);
        System.out.println((after - before) / 1000 + " Sekunden");

    }

    void transport(int n, char l, char m, char r) {
        if (n == 1) {
            System.out.println("Transportiere Scheibe 1 von Säule " + l + " zu Säule " + m);
            return;
        }

        transport(n-1, l, r, m);

        System.out.println("Transportiere Scheibe " + n + " von Säule " + l + " zu Säule " + m);

        transport(n-1, r, m, l);

    }
}
