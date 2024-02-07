package Test1;

public class Search {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int target = 50;
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + (right - left)/2);

            if(arr[mid] == target){
                System.out.print(mid);
                return;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        
        System.out.println("Element not found in the array");
    }
    
}
