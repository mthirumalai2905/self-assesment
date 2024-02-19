package Test5;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8, 9};
        
        int[] mergedArray = merge(nums1, nums2);
        
        System.out.println("Merged sorted array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m + n];
        
        System.arraycopy(nums1, 0, mergedArray, 0, m);
        System.arraycopy(nums2, 0, mergedArray, m, n);
        
        Arrays.sort(mergedArray);
        
        return mergedArray;
    }
}
