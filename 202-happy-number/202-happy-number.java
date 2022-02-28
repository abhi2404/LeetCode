class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
 
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            int rem=n%10;
            sum += rem*rem;
            n /= 10;
        }
        return sum==7||sum==1;
    }
}