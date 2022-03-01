class Solution {
    public boolean isSubsequence(String s, String t) {
    int count =0,l=s.length();
        if(s.length()==t.length()) return t.equals(s);
      while(l -->0){
          if(t.indexOf(s.charAt(count))==-1) return false;
          else{
            t= t.substring(t.indexOf(s.charAt(count)),t.length());
             if(!t.equals("")) t=t.substring(1,t.length());
          }
          count++;
      } 
    return true;
    }
}