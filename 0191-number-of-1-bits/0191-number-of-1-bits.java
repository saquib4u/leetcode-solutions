public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // 1st approach
        int countOnes = 0;
    	while(n!=0) {
    		countOnes = countOnes + (n & 1);
    		n = n>>>1;
    	}
    	return countOnes;
        
        //2nd approach
        //convert to string remove 0's and just return the length of the string
        //return Integer.toBinaryString(n).replaceAll("0","").length();
        
        //3rd approach
        //Use bitCount method  
        //return Integer.bitCount(n);  
    }
}