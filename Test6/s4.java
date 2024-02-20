package Test6;

import java.util.Arrays;

public class s4 {
    public static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        // Test case
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagrams(str1, str2)); // Output should be true
    }
}
