//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
	// Your code here
	for(int i=0;i<str.length();i++){
	    char c=str.charAt(i);
	    if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) return -1;
	    if(c=='-'&& (str.charAt(i+1)=='-'||str.charAt(i+1)=='+'||str.charAt(i+1)=='*'||str.charAt(i+1)=='/')|| (c=='-' && i!=0))  return -1;
	}
	return Integer.parseInt(str);
    }
}
