class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1|| n==2|| n==4) return true;
        int count=0;
        if(n%2!=0) return false;
        while(n>4){
            n=n/2;
            if(n%2!=0) return false;
            if(n==4) return true;
        }
    return false;
    }
}