class Solution {
    public int missingNumber(int[] nums) {
      Arrays.sort(nums);
    int i=0,l=nums.length;
    while(l -->0){
      if(i!=nums[i]) return i; 
        i++;
    }
        if(i==nums.length) return i;
    return 0;
    }
}