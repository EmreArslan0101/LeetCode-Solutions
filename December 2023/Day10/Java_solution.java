class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int[][] output = new int[matrix[0].length][matrix.length];

        for(int i = 0;i<output.length;i++) {
            for(int j = 0;j<output[0].length;j++) {
                output[i][j] = matrix[j][i];
            }
        }

        return output;
        
    }
}