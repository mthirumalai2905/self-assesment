public class SubstringIndex {
    public static void main(String[] args) {
        String str = "Java is fun";
        String subStr = "is";
        int index = str.indexOf(subStr);
        if (index != -1)
            System.out.println("Substring found at index: " + index);
        else
            System.out.println("Substring not found");
    }
}
