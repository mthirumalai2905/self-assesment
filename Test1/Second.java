package Test1;

public class Second {
    public static void main(String[] args) {
        int[] arr = {12, 35, 5, 10, 34};
        if(arr.length < 2){
           throw new IllegalArgumentException("Array must have atleast 2 numbers");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }

        System.out.print(secondLargest);
    }
    
}
