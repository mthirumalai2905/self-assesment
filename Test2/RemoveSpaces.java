public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Java is fun";
        str = str.replaceAll("\\s", "");
        System.out.println("String after removing spaces: " + str);
    }
}
