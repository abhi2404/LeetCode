class Solution {
    
    private void dfs(int node,List<List<Integer>> adj,int vis[]){
        vis[node]=1;
        for(int it:adj.get(node)){
            if(vis[it]==0){
                dfs(it,adj,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj= new ArrayList<>();
        
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
    int V=isConnected.length,count=0; 
    int vis[] = new int[V];
        
    for(int i=0;i<V;i++){
        if(vis[i]==0){
            count++;
            dfs(i,adj,vis);
        }
    }
    return count;    
    }
}