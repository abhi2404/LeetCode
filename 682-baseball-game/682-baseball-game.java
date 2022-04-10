class Solution {
    public int calPoints(String[] ops) {
   List<Integer> ll=new ArrayList<Integer>();
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("C")) ll.remove(ll.size()-1);
            else if(ops[i].equals("D")) ll.add(ll.get(ll.size()-1)*2);
            else if(ops[i].equals("+")) ll.add(ll.get(ll.size()-1)+ll.get(ll.size()-2));
            else ll.add(Integer.parseInt(ops[i]));
        }
        int sum=0;
        for( int i=0;i<ll.size();i++){
            sum+=ll.get(i);
        }
    return sum;
    }
}