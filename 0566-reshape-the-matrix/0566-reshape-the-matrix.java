class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int n = mat.length, m = mat[0].length;
      
      if(r * c != m * n) {
        return mat;
      }
      
      int answer[][] = new int[r][c];
      for(int i = 0; i < r * c; i ++) {
        answer[i / c][i % c] = mat[i / m][i % m];
      }
      return answer;
    }
}