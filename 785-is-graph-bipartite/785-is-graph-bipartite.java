class Solution {
    public boolean isBipartite(int[][] graph) {
      int [] color= new int[graph.length];
        Arrays.fill(color,-1);
        
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
               if (!dfs(i,color,graph))
                   return false;
            }
        }
    return true;
    }
    
    private boolean dfs(int node,int[] color, int [][] graph){
        if(color[node]==-1) color[node]=1;
        
        for(int it: graph[node]){
          if(color[it]==-1){
              color[it]=1-color[node];
              
              if (!dfs(it,color,graph))
                return false;
          }  
            else if(color[it]==color[node]) return false;
        }
    return true;
    }
    
}