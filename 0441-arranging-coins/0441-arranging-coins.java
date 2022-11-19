class Solution {
    public int arrangeCoins(int n) {
        
        //1st approach
//         long sum = 1;
//         int i = 1;
        
//         while(sum<=n){
//            if(sum == n)return i;
//             i++;
//             sum += i;
//         }
//         return i-1;
        
      //2nd approcah
        
      int i = 1;
      while(n >= i){
          n = n-i;
          i++;
      }
      return i-1;
    }
}