class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        for(var i=0;i<nums.length;i++){
            for(var j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
      return a;  
    }
}