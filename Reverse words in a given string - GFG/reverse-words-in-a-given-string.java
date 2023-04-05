//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        String result = "";
        String current = "";
        int N = s.length();
        
        for(int i = N - 1; i >= 0; i--) {
            current = "";
            while(i >= 0 && s.charAt(i) != '.') {
                current = s.charAt(i) + current;
                i--;
            }
             
            if(current.length() > 0) {
                    result=result+current;
                    if(result.length() < N-1){
                        result += ".";
                    }
            }
        }
        
        return result;
    }
}