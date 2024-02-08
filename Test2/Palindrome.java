package Test2;

public public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
 {
    
}
