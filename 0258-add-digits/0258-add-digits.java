class Solution {
    public int addDigits(int num) {
        if(num == 0) return 0;
        else if(num % 9 == 0) return 9;
        else return num % 9;
        
        
        //2nd approach
        
        // while (num > 9) {
        //     int t = num, sum = 0;
        //     while (t > 0) {
        //         sum += t % 10;
        //         t /= 10;
        //     }
        //     num = sum;
        // }
        // return num;
    }
}