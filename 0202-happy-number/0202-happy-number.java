class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7) return true;
       else if(n<=9) return false;
        int pro = 0; 
         while(n>0){
            int rem = n%10;
            n/=10;
            pro+=(rem*rem);
          }
         return isHappy(pro);
    }
}