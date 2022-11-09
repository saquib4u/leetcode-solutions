class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int l = words.length;
        if (l==0 || order.length()==0) return false;
        
        for (int i =1; i<l; i++){
            if (words[i-1].equals(words[i]) || words[i].startsWith(words[i-1])) continue;
            if (words[i-1].startsWith(words[i])) return false;
            int idx = 0;
            while (words[i].charAt(idx)==words[i-1].charAt(idx) ) idx++;
            if (order.indexOf(words[i].charAt(idx)) < order.indexOf(words[i-1].charAt(idx)))
                return false;
        }
        return true;
    }
}