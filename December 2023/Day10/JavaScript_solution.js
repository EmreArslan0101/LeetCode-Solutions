/**
 * @param {number[][]} matrix
 * @return {number[][]}
 */
var transpose = function(matrix) {
    
    //We initialize an vector sized as 1 x n,
    //Then we put something at every indice with Array.prototype.fill(parameter) (we had put "null" in every indice but you can put whatever you want)
    //After we used Array.prototype.map(callback) for putting m x 1 vectors which have different pointers; are different arrays
    //In the end, we initialize an transpose matrice that sized as m x n for our n x m sized matrice "matrix"
    //NOTE: Array.prototype.fill(parameter) just copies the reference (pointer) of "parameter" to every indice, not initializes the given value for every indice
    let output = new Array(matrix[0].length).fill(null).map(x => new Array(matrix.length));

    for(let i = 0;i<matrix.length;i++) {
        for(let j = 0;j<matrix[0].length;j++) {
            output[j][i] = matrix[i][j];
        }
    }

    return output;

};