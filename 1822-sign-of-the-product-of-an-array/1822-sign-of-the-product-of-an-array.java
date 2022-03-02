class Solution {
    public int arraySign(int[] nums) {
       int res=1, l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]==0) return 0;
            else if(nums[i]<0) nums[i]=-1;
            else nums[i]=1;
        }
        for(int i=0;i<l;i++){
            res*=nums[i];
        }
        return res;
    }
}