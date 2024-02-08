public class SubstringCheck {
    public static void main(String[] args) {
        String str = "Java is fun";
        String subStr = "fun";
        if (str.contains(subStr))
            System.out.println("Substring found");
        else
            System.out.println("Substring not found");
    }
}
