class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int count =0;
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==1){
        //         count++;
        //         max=Math.max(count,max);
        //     }
        //     else{
        //         count=0;
        //     }
        // }
        // return max;









        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum++;
                count=Math.max(sum, count);
            }
            else{
                sum=0;
            }
        }
        return count;
        
    }
}