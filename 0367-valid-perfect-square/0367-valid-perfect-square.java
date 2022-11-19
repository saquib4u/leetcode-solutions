class Solution {
    public boolean isPerfectSquare(int num) {
        //brute force approach
//         if(num == 1 || num==0) return true;
//         else {
//            for(int i =1; i<=num; i++){
//                 if(num%i==0 && i*i==num){
//                     return true;
//                 }
//             } 
//         }
        
//         return false;
        
        long start =2;
        long end = num/2;
        if(num<2){
                return true;
            }

        while(start<= end){
            
            long mid = start + (end - start)/2;
            long sqr = mid*mid;

            if(sqr == num){
                return true;
            }
            if(sqr > num){
                end = mid-1;               
            }else  {
                 start = mid+1;
            }

        }
        return false;
    }
}