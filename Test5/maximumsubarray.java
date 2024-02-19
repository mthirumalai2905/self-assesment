package Test5;

class maximumsubarray{

    public static int subarraySum(int[] arr){
        int maxEnding = arr[0];
        int maxFar = arr[0];

        for(int i = 0; i < arr.length; i++){
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            maxFar = Math.max(maxFar, maxEnding);
        }

        return maxFar;
    }
    public static void main(String[] args){
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 }; // Example input array
        int maxSum = subarraySum(nums);
        System.out.println("Maximum contiguous subarray sum: " + maxSum);
    }
}