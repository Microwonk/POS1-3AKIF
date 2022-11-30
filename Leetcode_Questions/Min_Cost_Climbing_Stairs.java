import java.lang.Math;

//https://leetcode.com/problems/min-cost-climbing-stairs/

public class Min_Cost_Climbing_Stairs {

    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};

        System.out.println(minCostClimbingStairs(cost));
    }


    public static int minCostClimbingStairs(int[] cost) {
        int length = cost.length;

        for (int i = 2; i < length; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[length - 1], cost[length - 2]);
    }
}
