import java.util.Arrays;

public class Median {
    public static double findMedian(int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 0) {
            // If the length of the array is even, return the average of the middle two elements
            int middleIndex1 = n / 2 - 1;
            int middleIndex2 = n / 2;
            return (arr[middleIndex1] + arr[middleIndex2]) / 2.0;
        } else {
            // If the length of the array is odd, return the middle element
            int middleIndex = n / 2;
            return arr[middleIndex];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        double median1 = findMedian(arr1);
        double median2 = findMedian(arr2);

        System.out.println("Median of arr1: " + median1);
        System.out.println("Median of arr2: " + median2);
    }
}
