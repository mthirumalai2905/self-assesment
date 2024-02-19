package Test5;

public class Rotate {
    public static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        return arr;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] result = rotate(nums, k);

        System.out.println("Array after rotating by " + k + " steps to the right:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
