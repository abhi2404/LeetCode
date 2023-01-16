//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        
        if(n==0) return "-1";
        
        String pre=arr[0];
        
        for(int i=1;i<n;i++){
            while(arr[i].indexOf(pre)!=0){
               pre=pre.substring(0,pre.length()-1); 
            }
        }
    if(pre.length()==0) return "-1";
    return pre;
    }
}