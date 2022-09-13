class Solution {
    public int longestConsecutive(int[] arr) {
    if(arr.length==0) return 0;
      int count=1, max_count=1;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]+1==arr[i]){
                count++;
            }else if(arr[i-1]==arr[i]){
                continue;
            }else{
                count=1;
            }
            max_count=Math.max(max_count,count);
        }
       return max_count;  
    }
}