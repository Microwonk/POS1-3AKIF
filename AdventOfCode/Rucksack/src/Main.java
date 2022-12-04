public class Main {
    
    public static void start () {
        int res = Rucksack.getSumOfPriorities();
        System.out.println(res);
        res = Rucksack.getSumOfBadges();
        System.out.println(res);
    }
    
    public static void main(String[] args) throws Exception {
        start();    
    }
}
