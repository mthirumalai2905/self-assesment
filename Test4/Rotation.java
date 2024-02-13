public class Rotation {
    public static int[] rotate(int[] arr1, int p){
        int n = arr1.length;
        int[] rotatedArray = new int[n];
        
        // Copy the last p elements from arr1 to the beginning of rotatedArray
        for (int i = 0; i < p; i++) {
            rotatedArray[i] = arr1[n - p + i];
        }
        
        // Copy the remaining elements from arr1 to the rotatedArray
        for (int i = p; i < n; i++) {
            rotatedArray[i] = arr1[i - p];
        }
        
        return rotatedArray;
    }
    

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int positions = 2;
        int[] rotatedArray = rotate(originalArray, positions);

        // Print the rotated array
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }
}
