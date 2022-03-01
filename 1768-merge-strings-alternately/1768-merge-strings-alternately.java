class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length(),l2=word2.length(), count=0;
        StringBuilder res= new StringBuilder();
        if(l1>l2){
        while(count<l2){
          res.append(word1.charAt(count));  
          res.append(word2.charAt(count));
            count ++;
        }
        }
        if(l1<l2){
        while(count<l1){
          res.append(word1.charAt(count));  
          res.append(word2.charAt(count));
            count ++;
        }
        }
            if(l1>l2){
                res.append(word1.substring(l2,l1));
            }else{
                res.append(word2.substring(l1,l2));
            }
    if(l1==l2){
            while(l1-->0){
             res.append(word1.charAt(count));  
            res.append(word2.charAt(count));  
                count++;
            }
    }
    return res.toString();
    }
}