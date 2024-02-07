package Test1;

public class summmer{
     public static void main(String[] args){
        int[] arr = {1,11,12,13,14,15,15};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.print("The Sum of all the elements in the arrays is:-"+sum);
        
     }
}