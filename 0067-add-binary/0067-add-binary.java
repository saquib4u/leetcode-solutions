import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger A = new BigInteger(a,2);    // Convert String a to its equivalent Integer value
        BigInteger B = new BigInteger(b,2);  // Convert String b to its equivalent Integer value
        BigInteger C = A.add(B);    // Add the two numbers
        
        return C.toString(2);   // Return the answer in binary form as a string
    }
}