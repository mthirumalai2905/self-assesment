package Test6;

public class s3 {
  
        public static String reverseString(String str) {
            char[] charArray = str.toCharArray();
            int start = 0;
            int end = str.length() - 1;

            while(start < end){
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }

            return new String(charArray);

        }
    
        public static void main(String[] args) {
            // Test case
            String input = "hello";
            System.out.println(reverseString(input)); // Output should be "olleh"
        }

    
}
