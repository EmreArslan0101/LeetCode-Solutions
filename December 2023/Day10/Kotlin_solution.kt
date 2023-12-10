class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        
        var output : Array<IntArray> = Array(matrix[0].size) {x -> IntArray(matrix.size){0}}

        for(i in 0..(output.size-1)) {
            for(j in 0..(output[0].size-1)) {
                output[i][j] = matrix[j][i]
            }
        }

        return output

    }
}