class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        //Checking the edge cases.
        if (s1.length()!=s2.length())return false;
        if (s1.equals(s2))return true;
		
        int temp=-1;
        int count=0;
        boolean result=false;
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                count++;
				//Counting how many different letters we have.
                if (temp!=-1){
                    result=(s2.charAt(i)==s1.charAt(temp))&&(s2.charAt(temp)==s1.charAt(i));
					//If we took an index before we compare letters.
                }
                else temp=i;
				//When we see a different letter we take its index.
            }
        }
		//If we saw 2 different letters and we can solve this by changing index we return true. Otherwise false.
        return (count == 2)&&result;
    }
}