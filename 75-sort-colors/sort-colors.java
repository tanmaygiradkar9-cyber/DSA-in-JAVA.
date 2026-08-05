class Solution {
    // public void sortColors(int[] nums) {
    //     // Arrays.sort(nums);

    //     for(int i=0;i<nums.length-1;i++){
    //         for(int j=0;j<nums.length-1-i;j++){
    //             if(nums[j]>nums[j+1]){
    //                 int temp=nums[j];
    //                 nums[j]=nums[j+1];
    //                 nums[j+1]=temp;
    //             }
    //         }
    //     }
        
    // } this is not best approch bcause time complaxity will n2..
    public void sortColors(int[] nums) {
        
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){

            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++;
                low++;

            }
            else if(nums[mid]==1){
                mid++;

            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        
    }
}