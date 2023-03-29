//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[2*N];
            for(int i = 0;i < 2*N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minThrow(N, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int minThrow(int N, int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 2 * N; i += 2) {
            map.put(arr[i], arr[i + 1]);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        boolean[] visited = new boolean[31];
        visited[1] = true;
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int curr = queue.poll();
                if (curr == 30) {
                    return steps;
                }
                for (int i = 1; i <= 6 && curr + i <= 30; i++) {
                    int next = curr + i;
                    if (map.containsKey(next)) {
                        next = map.get(next);
                    }
                    if (!visited[next]) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}