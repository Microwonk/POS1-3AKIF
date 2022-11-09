import java.util.Scanner;

public class Hanoi {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
    
        System.out.println("Eingabe der insgesamten Scheiben: ");
        int n = s.nextInt();
    
        transport(n, 'L', 'M', 'R');
        s.close();
    }

    static void transport(int n, char SaeuleL, char SaeuleM, char SaeuleR) {
        if (n == 1) {
            System.out.println("Transportiere Scheibe 1 von Säule " + SaeuleL + " zu Säule " + SaeuleM);
            return;
        }

        transport(n-1, SaeuleL, SaeuleR, SaeuleM);

        System.out.println("Transportiere Scheibe " + n + " von Säule " + SaeuleL + " zu Säule " + SaeuleM);

        transport(n-1, SaeuleR, SaeuleM, SaeuleL);
    }

}
