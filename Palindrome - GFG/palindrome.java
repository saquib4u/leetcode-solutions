//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_palindrome(n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        // int rev=0;
        // while(n!=0){
        //     rev = rev * 10 + n%10;
        //     rev /= 10;
        // }
        // if(n==rev) return "Yes";
        // else return "No";
        String s = Integer.toString(n);
        StringBuffer sb = new StringBuffer(s);
        String s2=sb.reverse().toString();
        if(s2.equals(s)) return "Yes";
        else return "No";
    }
}