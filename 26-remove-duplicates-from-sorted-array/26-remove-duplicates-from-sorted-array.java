class Solution {
    public int removeDuplicates(int[] nums) {
         int res =1;
        for ( int j=1;j<nums.length;j++){
            if(nums[j]!=nums[res-1]){
                nums[res]=nums[j];
                res++;
            }
        }
    return res;
    }
}