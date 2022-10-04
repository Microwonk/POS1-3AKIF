/*public class Placeholder{
    public static void main(String[] args) {
        int april = 12;
        int mai = 14;
        int juni = 8;
        double durchschnitt = (april + mai + juni)/3.0;
        System.out.println("Niederschlag im April: " +april);
        System.out.println("Niederschlag im Mai: " +mai);
        System.out.println("Niederschlag im Juni: " +juni);
        System.out.println("Durchschnitt des Niederschlags: " + durchschnitt);
    }
}*/

/*public class Placeholder{
    public static void main(String[] args) {
        double sinx = Math.sin(0.5235);
    double cosx = Math.cos(0.5235);
    double ergebnis = sinx*sinx + cosx*cosx;
    System.out.println("Sinus: " +sinx+ " Cosinus: " +cosx+ "Ergebnis: " +ergebnis);
    }
}*/

public class Placeholder{
    public static void main(String[] args) {
        double bogenmass, grad, sinx, cosx, ergebnis;
        
        grad = 359;
        bogenmass = grad*Math.PI/180;
        sinx = Math.sin(bogenmass);
        cosx = Math.cos(bogenmass);
        ergebnis = sinx*sinx + cosx*cosx;
        System.out.println("Sinus: " +sinx+ " Cosinus: " +cosx+ "Ergebnis: " +ergebnis+ " Bogenmass: " +bogenmass);
    }
}