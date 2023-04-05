//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    }
    
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt(); // Inputting the testcases
        PrintWriter out = new PrintWriter(System.out);
        while (t-- > 0) {

            int i = 0;
            int N = sc.nextInt();

            int arr[] = new int[(int)(N)];

            for (i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            Solution ob = new Solution();
            out.println(ob.countSpecialNumbers(N, arr));
        }
        out.flush();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int countSpecialNumbers(int N, int arr[]) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (i < N - 1 && arr[i] == arr[i + 1]) {
                count++;
                continue;
            }
            boolean isSpecial = false;
            for (int j = (int) Math.sqrt(arr[i]); j >= 1; j--) {
                if (arr[i] % j == 0) { 
                    int k = Arrays.binarySearch(arr, 0, i, j); 
                    if (k >= 0) { 
                        isSpecial = true;
                        break; 
                    }
                    k = Arrays.binarySearch(arr, 0, i, arr[i] / j); 
                    if (k >= 0) {
                        isSpecial = true;
                        break; 
                    }
                }
            }
            if (isSpecial) {
                count++;
            }
        }
        return count;
    }
}