import java.util.Arrays;

//https://leetcode.com/problems/find-greatest-common-divisor-of-array/

/* First implementation

public class Find_Greatest_Common_Divisor_Of_Array {
    public static void main(String[] args) {
        int nums[] = {7,5,6,8,3};

        int minNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            minNum = Math.min(minNum, nums[i]);
        }

        int maxNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxNum = Math.max(maxNum, nums[i]);
        }
        
        System.out.println(findGCD(maxNum, minNum));
    }

    public static int findGCD(int maxNum, int minNum) {
        if(minNum == 0) {
            return maxNum;
        }
        return findGCD(minNum, maxNum % minNum);
    }

}

 */

 // Second implementation

public class Find_Greatest_Common_Divisor_Of_Array {
    
    public static void main(String[] args) {
        int nums[] = {7,5,6,8,3};

        System.out.println(findGCD(nums));
    }
    
    public static int findGCD(int[] nums) {
        int small = nums[0];
        int big = nums[0] ;
        int gcd = 1;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] < small){
                small = nums[i];
            }
            else{
                if(nums[i]>big){
                    big=nums[i];
                }
            }
        }
        for(int i = 1 ; i <= small ; i ++){
            if(big % i == 0 && small % i == 0){
                gcd = i;
            }
        }
        return gcd;
        
    }
}