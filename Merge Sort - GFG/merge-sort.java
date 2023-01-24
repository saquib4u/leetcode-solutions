//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    // void merge(int arr[], int l, int mid, int r){
    //      int i = 0;
    //      int j = 0;
    //      int k = 0;
    //      int temp[] = new int[10000];
         
    //      while(i <= mid && j <= r){
    //          if(arr[i] < arr[j]){
    //              temp[k++]=arr[i++];
    //          }
    //          else{
    //              temp[k++] = arr[j++];
    //          }
    //      }
         
    //      for(; i<= mid; i++){
    //          temp[k++]=arr[i];
    //      }
    //      for(; j<= r; j++){
    //          temp[k++] = arr[j];
    //      }
        
    //      for(k=0; k<=r; k++){
    //          arr[k] = temp[k];
    //      }
         
    // }
    // void mergeSort(int arr[], int l, int r){
        
    //     if(l<r){
    //         int mid = (l + r)/2;
    //         mergeSort(arr, l, mid);
    //         mergeSort(arr, mid+1, r);
    //         merge(arr, l, mid, r);
    //     }
    // }
    
    
    void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    void mergeSort(int arr[], int l, int r){
        
        if(l<r){
            int m = (l + r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    
}
