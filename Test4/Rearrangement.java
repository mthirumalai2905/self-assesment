import java.util.Arrays;

public class Rearrangement {
    public static void rearrangeArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move the left pointer until it points to an odd element
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // Move the right pointer until it points to an even element
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            // Swap the elements at left and right pointers
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 8, 2, 5, 6, 4, 9};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        rearrangeArray(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    
    }
}
