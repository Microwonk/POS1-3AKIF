import java.util.Arrays;

public class Main {

    private static void start() {
        int[] allCalories = Elves.getEachCalories();

        Arrays.sort(allCalories);
        System.out.println(Arrays.toString(allCalories));

        int maxNum = allCalories[allCalories.length - 1];
        int maxNum1 = allCalories[allCalories.length-2];
        int maxNum2 = allCalories[allCalories.length-3];

        System.out.println();
        System.out.println(maxNum +" " + maxNum1 +" " + maxNum2);
        System.out.println("Maxnummer von den höchsten 3: " + (maxNum + maxNum1 + maxNum2));
    }

    public static void main(String[] args) throws Exception {
        start();
    }
}
