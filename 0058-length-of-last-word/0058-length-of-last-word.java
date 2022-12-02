class Solution {
    public int lengthOfLastWord(String s) {
        String[] g = s.split(" ");
        return g[g.length-1].length();
    }
}