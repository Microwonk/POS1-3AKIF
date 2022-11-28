import java.util.Arrays;

//https://leetcode.com/problems/two-sum/

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {3,3};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length - 1 ; i++) {
            for(int j = i + 1 ; j < nums.length ; j++) {
                if(nums[i] + nums[j] == target)
                    return new int[]{i , j};
            }
        }
    return new int[]{-1 , -1};
    }
}
