class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median=0;
        int m=nums1.length,n=nums2.length;
        int[] res=new int[m+n];
        for(int i=0;i<m;i++){
            res[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            res[i+m]=nums2[i];
        }
        Arrays.sort(res);
        if((m+n)%2==0){
            int half=(m+n)/2;
            median=(double)(res[half-1]+res[half])/2;
            // median=res[half];
        }
        else{
            median=res[(m+n)/2];
        }
        return median;
    }
}