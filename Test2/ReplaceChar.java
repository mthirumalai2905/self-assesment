public class ReplaceCharacters {
    public static void main(String[] args) {
        String str = "Java is fun";
        char oldChar = 'a';
        char newChar = 'X';
        String replaced = str.replace(oldChar, newChar);
        System.out.println("String after replacement: " + replaced);
    }
}
