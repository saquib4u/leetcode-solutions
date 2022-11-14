class Solution{
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = s1.length();
        int start= 0;
        int end = len-1;
        while(start<end){
            if(s1.charAt(start) != s1.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}