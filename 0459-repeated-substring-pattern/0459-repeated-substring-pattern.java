class Solution {
    public boolean repeatedSubstringPattern(String s) {
         for(int i=1;i<s.length();i++){
           if(s.length()%i==0){
               StringBuilder s1=new StringBuilder();
               String sub=s.substring(0,i);
               int reps=s.length()/i;

               for(int j=0;j<reps;j++){
                   s1.append(sub);
               }
               if(s1.toString().equals(s)){
                   return true;
               }
           }
       }
        return false;
    }
}