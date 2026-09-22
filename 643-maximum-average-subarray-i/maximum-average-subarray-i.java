class Solution {
 

    public static void main(String[] args) {
        int k=4;
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, k));

    }
    public static  double findMaxAverage(int[] nums, int k) {

        long averageSum =0;
        for (int i = 0; i < k; i++) {
            averageSum = averageSum + nums[i];
        }
        long maxSum = averageSum;

        for (int i = k; i < nums.length; i++) {
            averageSum = averageSum + nums[i];
            averageSum = averageSum - nums[i - k];
            maxSum = Math.max(maxSum, averageSum);
        }
        
        return (double) maxSum / k;
    }

}




