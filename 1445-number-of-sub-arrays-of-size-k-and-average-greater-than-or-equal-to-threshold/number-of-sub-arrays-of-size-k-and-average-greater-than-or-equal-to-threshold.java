class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {


        int count=0;
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum=windowSum+ nums[i];// it  do sum of first window
        }
        if(windowSum>=k*threshold){
            count++;
        }
        for(int i=k;i<nums.length;i++){
            windowSum=windowSum+nums[i];
            windowSum=windowSum-nums[i-k];

            if(windowSum>=k*threshold){
                count++;
            }
        }
        return count;
        
    }
}