//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        if(a.length() != b.length()){
            return false;
        }
        char[] input1=a.toCharArray();
        char[] input2=b.toCharArray();
        Arrays.sort(input1);
        Arrays.sort(input2);
        if(Arrays.equals(input1, input2)){
            return true;
        }
        else{
            return false;
        } 
        
        
        // if(a.length() != b.length()){
        //     return false;
        // }
        // for(int i = 0; i<Math.max(a.length(), b.length()); i++){
        //     for(int j = 0; j<Math.max(a.length(), b.length()); j++){
        //         if(a.charAt(i) == b.charAt(j)){
        //             break;
        //         }
                
        //     }
        // }
        // return false;
        
        // for(i = 0; i < str1.length; i++){
        //     count[str1[i]]++;
        //     count[str2[i]]--;
        // }
        // for(i = 0; i < NO_OF_CHARS; i++)
        //     if (count[i] != 0){
        //         return false;
        //     }
        //     return true;
            
        // }
    }
}