package Test3;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        
        //Question 1: Create an ArrayList called "numbers" that can store integers.
        ArrayList<Integer> numbers = new ArrayList<>();
        
        //Question 2: Add the numbers 5, 10, 15, 20 to the "numbers" ArrayList
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        //Question 3: Print the size of the "numbers" ArrayList.
        System.out.println("Size of numbers ArrayList: " + numbers.size());

        //Question 4: Check if the "numbers" ArrayList contains the number 10 
        System.out.println("Does numbers contain 10 ? " + numbers.contains(10));

        //Question 5: Remove the number 15 from the "numbers" ArrayList.
        numbers.remove(Integer.valueOf(15));
        for(int num : numbers){
            System.out.println(num);
        }

        //Question 7 : Create a new ArrayList called "colors" that can store strings.
        ArrayList<String> colors = new ArrayList<>();

        //Question 8: Add the colors red, green, and blue to the colors ArrayList
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        //Question 10: Clear all the elements from the "colors" ArrayList.
        colors.clear();
        System.out.println("After clearing, is colors ArrayList empty? " + colors.isEmpty());
    }
    
}
