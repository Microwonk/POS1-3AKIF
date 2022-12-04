import java.util.Arrays;

public class Main {

    public static void start() {
        int[] Overlaps = IDs.getAllOverlaps();
        System.out.println(Arrays.toString(Overlaps));
    }

    public static void main(String[] args) throws Exception {
        start();
    }
}
