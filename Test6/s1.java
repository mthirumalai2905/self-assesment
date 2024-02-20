package Test6;

public class s1 {
    
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;


        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String input = "radar";
        System.out.println(isPalindrome(input)); // Output should be true
    }
}