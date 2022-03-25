class Solution {
    public List<Integer> majorityElement(int[] nums) {
     int mj1=-1,mj2=-1,count1=0,count2=0;
        for(int el:nums){
            if(el==mj1) count1++;
            else if(el==mj2)count2++;
            else if(count1==0) {
                mj1=el;
                count1=1;
            }
            else if(count2==0) {
                mj2=el;
                count2=1;
            }
            else{
                count1--;
                count2 --;
            }
        }
        List<Integer> ll=new ArrayList<>();
        int c1=0,c2=0;
        for(int i:nums){
            if(i==mj1) c1++;
            else if(i==mj2) c2++;
        }
        if(c1>nums.length/3) ll.add(mj1);
        if(c2>nums.length/3) ll.add(mj2);
    return ll;
    }
}