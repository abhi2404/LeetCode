class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       if(mat.length==r && mat[0].length==c) return mat;
    if(mat.length*mat[0].length!=r*c) return mat;
    int m=mat[0].length;
    int[][] res = new int[r][c];
    for (int i=0;i<r*c;i++) 
        res[i/c][i%c] = mat[i/m][i%m];
    return res;

    }
}