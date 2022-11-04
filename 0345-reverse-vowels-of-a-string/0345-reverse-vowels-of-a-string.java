class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        int j = s.length() - 1;
        for (int i = 0; i < s.length(); i++){
            if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1){
                while (j >= 0 && "AEIOUaeiou".indexOf(s.charAt(j)) == -1){
                    j--;
                }
                sb.append(s.charAt(j));
                j--;
            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}