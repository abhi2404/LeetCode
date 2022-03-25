class Solution {
    public int majorityElement(int[] num) {
    
        int major=0, count = 0;
        for(int n:num){
            if(count==0)
                major=n;
            if(major==n) count++;
            else count--;
        }
        return major;
    }
}