class Solution {
    public char findTheDifference(String s, String t) {
        if(s == null) return '\0';
        int val = t.charAt(t.length()-1);
        for(int i=0; i < s.length(); i++)
            val = val - s.charAt(i) + t.charAt(i);
        return (char) val;
    }
}