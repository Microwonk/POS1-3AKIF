public class Funktionstabellen {
    public static void main(String[] args) {
        
        boolean a, b, c;
        a= true;
        b= false;
        c= true;

        if ( !(a || b) && !!c) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        
        if ( (a & !b & c) || (c^c)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}