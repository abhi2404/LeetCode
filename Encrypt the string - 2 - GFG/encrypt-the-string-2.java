//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine();

            Solution ob = new Solution();

            System.out.println(ob.encryptString(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
     static String convertToHex(int num)
    {
 
        StringBuilder temp = new StringBuilder();
        while (num != 0) {
            int rem = num % 16;
            char c;
            if (rem < 10) {
                c = (char) (rem + 48);
            }
            else {
                c = (char) (rem + 87);
            }
            temp.append(c);
            num = num / 16;
        }
 
        return temp.toString();
    }
 
    static String encryptString(String S){
        int N=S.length();
        // code here
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
 
            char ch = S.charAt(i);
            int count = 0;
            String hex;
 
            while (i < N && S.charAt(i) == ch) {
 
                count++;
                i++;
            }
 
            i--;
 
            hex = convertToHex(count);
 
            ans.append(ch);
 
            ans.append(hex);
        }
         ans.reverse();
        return ans.toString();
    }
};