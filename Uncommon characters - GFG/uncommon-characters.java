//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        String result="";
        Set<Character> set1=new HashSet<>();
        Set<Character> set2=new HashSet<>();
        
        for(int i=0;i<A.length();i++){
            set1.add(A.charAt(i));
        }
        for(int i=0;i<B.length();i++)
        set2.add(B.charAt(i));
        
        for(char x:set1){
            if(!set2.contains(x))
            result=result+x;
        }
        
        for(char x:set2){
            if(!set1.contains(x))
            result=result+x;
        }
        
        char str[]=result.toCharArray();
        Arrays.sort(str);
        result=new String(str);
        
        if(result.equals(""))
            return "-1";
        else
            return result;
        
    }
}