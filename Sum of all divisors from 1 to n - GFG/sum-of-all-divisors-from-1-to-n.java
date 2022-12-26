//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long sumOfDivisors(int N){
        // code here
        long ans=0L;

        //BRUTE FORCE APPROACH TC: O(n^2)
        // for(int i =1; i<=N; i++){
        //     for(int j=1; j<=i; j++){
        //         if(i%j == 0){
        //             ans += j;
        //         }
        //     }
        // }
        // return ans;
        
        
        //OPTIMIZED APPROACH TC: O(n sqrt(n))
        // for(int i =1; i<=N; i++){
        //     for(int j =1; j<=(int)Math.sqrt(i);j++){
        //         if(i%j==0){
        //             // ans += j;
        //             // if(j != i/j){
        //             //     ans += i/j;
        //             // }
        //             if (i / j == j)
        //                 ans += j;
        //             else
        //                 ans += j + i / j;
        //         }
        //     }
        // }
        // return ans;
        
        //OPTIMIZED APPROACH TC: O(n)
        for (int i = 1; i <= N; ++i)
            ans += (N / i) * i;
        return ans;
    }
}