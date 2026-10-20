class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

    //    Arrays.sort(nums);
    //    List<Integer> result = new ArrayList<>();

    //    for(int i=0;i<nums.length;i++){
    //     if(nums[i]==target){
    //         result.add(i);
    //     }
    //    }
    //    return result;

    int small=0;
    int great=0;

    for(int num : nums){
        if(num<target){
            small++;

        }
        else if(num==target){
            great++;
        }
    }

    List<Integer> result = new ArrayList<>();


    for(int i=small;i<small+great;i++){

        result.add(i);
    }
    return result;























        
    }
}