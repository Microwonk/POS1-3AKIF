
public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        FirstObject f = new FirstObject();
        SecondObject s = new SecondObject();

        System.out.println("multiplyMethod:");
        System.out.println(FirstObject.multiplyMethod(4));
        System.out.println(FirstObject.multiplyMethod(5));
        System.out.println(FirstObject.multiplyMethod(16));

        System.out.println("yourName:");
        f.yourName();

        System.out.println("memeMethod:");
        s.memeMethod(4);

        SecondObject.codeGuess(7);

        System.out.println(ThirdObject.Zahl(5, 5));
    }
}
