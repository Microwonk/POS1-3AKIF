import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/median-of-two-sorted-arrays/

public class Median_Of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List list = new ArrayList(Arrays.asList(nums1));
        list.addAll(Arrays.asList(nums2));

        Object[] merged = list.toArray();
        Arrays.sort(merged);

        int mergedlength = merged.length;

        if (mergedlength%2 == 0) {
            return (Integer.valueOf(merged[mergedlength/2]) + Integer.valueOf(merged[mergedlength/2 + 1])) / 2.0;
        }
        else {
            return Integer.parseInt(merged[mergedlength/2]);
        }
    }
}