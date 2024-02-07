package Test1;

public class Remove {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int remove = 3;

        int[] new_arr = new int[arr.length];

        for(int i =0; i< arr.length; i++){
            if(arr[i] == remove){
                System.out.print("Removed");
            }else{
            new_arr[i] = arr[i];
            }
        }

        for(int i =0; i<new_arr.length; i++){
            System.out.print(new_arr[i]);
        }
    }
    
}
