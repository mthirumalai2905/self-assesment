package Test1;

public class maximum {
    public static void main(String[] args){
        //METHOD1 ACTING PRO
        int[] myArray = {8,10,59,62,3,4};

        int max_num = 0;

        for(int i = 0; i < myArray.length; i++){
            max_num = Math.max(max_num, myArray[i]);
        }

        System.out.print(max_num);
        
    }

    //METHOD2
    //USE BASIC SORTING METHOD THEN RETURN N - 1TH TERM
    
}
