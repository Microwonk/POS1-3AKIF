public class Modellieren {
    public static void main(String[] args) {
    int i;
    i = 1;

   do {
        System.out.print(i +", ");
        if (i == 39) {
            i = 61;
        }
        else {
            i++;
        }
    }
    while (i<=100);
    return;
    }
}