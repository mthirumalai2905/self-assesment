package Test1;

public class Copied {
    public static void main(String[] args) {
        //METHOD1
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];

        //for(int i=0; i<arr1.length; i++){
          //  arr2[i] = arr1[i];
        //}

        //for(int i=0; i<arr2.length; i++){
          //  System.out.print(arr2[i]);
        //}

        //METHOD2
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        // Print the contents of both arrays to verify the copy
        System.out.println("Source Array: ");
        for (int element : arr1) {
            System.out.print(element + " ");
        }

        System.out.println("\nDestination Array: ");
        for (int element : arr2) {
            System.out.print(element + " ");
        }
    }
    
}
