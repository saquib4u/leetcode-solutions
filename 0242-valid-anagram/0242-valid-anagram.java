class Solution {
    public boolean isAnagram(String s, String t) {
        char[] input1=s.toCharArray();
        char[] input2=t.toCharArray();
        Arrays.sort(input1);
        Arrays.sort(input2);
        if(Arrays.equals(input1, input2)){
            return true;
        }
        else{
            return false;
        } 
    }
}