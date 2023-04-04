//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String str = br.readLine();
			Solution obj = new Solution();
			System.out.println(obj.minSteps(str));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
	int minSteps(String str) {
		int a=0, b=0;
	    char pr='0';
	    for(char cur : str.toCharArray()){
	        if(pr==cur) continue;
	        if(cur=='a') a++;
	        else b++;
	        pr =cur;
	    }
	    return a==b? a+1: Math.max(a, b);
	}
}