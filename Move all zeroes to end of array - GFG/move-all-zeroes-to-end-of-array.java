//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        //1st approach
        // code here
        // int temp[]=new int[n];
        // int k = 0;
        // for(int i = 0; i<n; i++){
        //     if(arr[i] != 0){
        //         temp[k]=arr[i];
        //         k++;
        //     }
        // }
        // while(k<n){
        //     temp[k]=0;
        //     k++;
        // }
        // for(int i = 0; i<n; i++){
        //     arr[i]=temp[i];
        // }
       
        
        //2nd approach
        // int count = 0;
        // for(int i = 0; i<n; i++){
        //     if(arr[i]!=0){
        //         arr[count++]=arr[i];
        //     }
        // }
        // while(count<n){
        //     arr[count++]=0;
        // }
        
        
        //3rd approach
        int k = 0;
        for(k=0; k<arr.length; k++){
            if(arr[k] == 0){
                break;
            }
        }
    
        //finding zeros and immediate non-zero elements and swapping them
        int i = k, j = k + 1;
    
        while (i < arr.length && j < arr.length) {
          if (arr[j] != 0) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
    
          }
    
          j++;
    
        }
    }
}