//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{

    public long findMinDiff(ArrayList<Integer> A, int N, int M) {

    if (N == 0 || M == 0) {
        return 0;
    }

    if (N < M) {
        return -1;
    }

    Collections.sort(A);

    long result = Long.MAX_VALUE;
    // Loop from the first packet to the last possible packet that can be given to the first student
    for (int i = 0; i + M - 1 < N; i++) {
        // Find the difference between the current packet and the last possible packet that can be given to the last student
        long diff = A.get(i + M - 1) - A.get(i);

        if (diff < result) {
            result = diff;
        }
    }

    return result;
}
}