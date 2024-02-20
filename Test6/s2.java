package Test6;

import java.util.HashSet;
import java.util.Set;

public class s2 {
    public static String removeDuplicates(String str) {
        Set<Character> charset = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(int i =0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            if(!charset.contains(currentChar)){
                charset.add(currentChar);
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test case
        String input = "hello";
        System.out.println(removeDuplicates(input)); // Output should be "helo"
    }
}