class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i;
        Stack<Integer> s=new Stack<>();   
        s.push(nums2[nums2.length-1]);
        int []arr=new int[nums2.length];    
        arr[nums2.length-1]=-1;
        
        for(i=nums2.length-2;i>=0;i--){
            while(s.size()>0 && nums2[i]>s.peek()){
                s.pop();
            }
            if(s.size()>0){
                arr[i]=s.peek();   
            }
            else{
                arr[i]=-1;
            }
            s.push(nums2[i]);
        }      

        int []res=new int[nums1.length];
        for(i=0;i<nums1.length;i++){  
             for(int j=0;j<nums2.length;j++){
                 if(nums1[i]==nums2[j]){
                    res[i]=arr[j];
                     break;
                 }
             }
        }      
        
        return res;
    }
}