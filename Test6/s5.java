package Test6;

public class s5 {
    public static void countVowelsConsonants(String str) {
    int vowel = 0;
    int consonant = 0;

    for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch >= 'a' && ch <= 'z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
                vowel++;
            }
            else{
                consonant++;
            }
            
        }
        

       
    }
    System.out.println("Vowels: " + vowel);
    System.out.println("Consonants: " + consonant);

    }

    public static void main(String[] args) {
        // Test case
        String input = "hello";
        countVowelsConsonants(input); // Output should be "Vowels: 3, Consonants: 7"
    }
}