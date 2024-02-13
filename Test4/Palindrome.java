public class Palindrome {
    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Is arr1 a palindrome? " + isPalindrome(arr1));
        System.out.println("Is arr2 a palindrome? " + isPalindrome(arr2));
    }
}
