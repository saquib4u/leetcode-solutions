class Solution {
    public int arrangeCoins(int n) {
        long sum = 1;
        int i = 1;
        
        while(sum<=n){
           if(sum == n)return i;
            i++;
            sum += i;
        }
        return i-1;
    }
}