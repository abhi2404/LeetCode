class Solution {
    public void rotate(int[] arr, int k) {
    int l=arr.length;
        k = k % arr.length;
     for(int i=0;i<(l-k)/2;i++){
         int temp=arr[i];
         arr[i]=arr[l-i-k-1];
         arr[l-k-i-1]=temp;
     }  
    for(int i=0;i<k/2;i++){
       int temp=arr[l-k+i];
        arr[l-k+i]=arr[l-i-1];
        arr[l-i-1]=temp;
        
    }
    for(int i=0;i<l/2;i++){
        int temp=arr[i];
        arr[i]=arr[l-i-1];
        arr[l-i-1]=temp;
    }
    }
}