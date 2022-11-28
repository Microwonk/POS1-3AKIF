public class reversefakultaet {
    public static void main(String[] args) {
        int i = 1;
        int n = 120;

        while (i < n) {
            n = n / i;
            i++;
        }
        System.out.println(n);
    }
}