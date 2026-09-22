class Solution {
 

    public static void main(String[] args) {
        int k=4;
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, k));

    }
    public static  double findMaxAverage(int[] nums, int k) {
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum=windowSum+nums[i];//1,12,-5,-6 //2


        }
        int maxSum=windowSum;//2
        for(int i=k;i<nums.length;i++){//1,12,-5,-6,50
        windowSum=windowSum+nums[i];//2+50=52
        windowSum=windowSum-nums[i-k]; //52-1=51 //i=4-k=4=0 nums[0]=1
        maxSum=Math.max(windowSum,maxSum);
        }

        return (double)maxSum/k;



       
    }

}




