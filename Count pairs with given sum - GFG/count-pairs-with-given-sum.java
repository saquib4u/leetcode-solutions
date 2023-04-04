//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {

    int getPairsCount(int[] arr, int n, int k) {

    // Create an empty HashMap
    HashMap<Integer, Integer> freq = new HashMap<>();

    // Store counts of all elements in HashMap
    for (int i = 0; i < n; i++) {
        // If element is already present in HashMap, increment its count
        if (freq.containsKey(arr[i])) {
            freq.put(arr[i], freq.get(arr[i]) + 1);
        }
        // Else add it to the HashMap with count 1
        else {
            freq.put(arr[i], 1);
        }
    }

    // Initialize result
    int count = 0;

    // Iterate through each element and increment the count if (k - arr[i]) is also present in HashMap
    for (int i = 0; i < n; i++) {
        // Check if (k - arr[i]) is present in HashMap
        if (freq.containsKey(k - arr[i])) {
            // Increment the count by the frequency of (k - arr[i])
            count += freq.get(k - arr[i]);
        }

        // If arr[i] is equal to k/2, then decrement its count by one to avoid counting the pair twice
        if (k - arr[i] == arr[i]) {
            count--;
        }
    }

    // Return half of the final count as each pair is counted twice
    return count / 2;
}
}
