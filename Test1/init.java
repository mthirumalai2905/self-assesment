package Test1;

public class init {
    //METHOD1
    public static void main(String[] args){
        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;

        for(int i=0; i<myArray.length; i++){
            if(i == 0){
                System.out.print("[");
            }
            System.out.print(myArray[i]);
            if(i>=0 && i<myArray.length-1){
            System.out.print(",");
            }
            if(i == myArray.length - 1){
                System.out.print("]");
            }
        }

    }

    //METHOD2
   // int[] arr = new int[6];
     //  int count = 0;
       
       //for(int i = 0; i<=5; i++){
         //  arr[i] = count;
           //count++;
       //}
       //for(int i=0; i<=5; i++){
       //System.out.print(arr[i]);
       //}
}
