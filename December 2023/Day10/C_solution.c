/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
//This compiler directive is for optimizing for loops
//It makes the output file of this code (I mean the file we get after this code compiled)
//It is good for if your code rely on very much unoptimizeable or unoptimized loops
//It makes your code faster in runtime in that cases but longer in compiling
//However, it is not efficient in small math operations or already optimized codes
//"O3" => Is for aggressive optimization, It means faster code execution and slower compiling of the code
//"unroll-loops" => It unrolls the loop body and shortens the time for loop condition checking but it longers the compiled code 
#pragma GCC optimize("O3", "unroll-loops")
int** transpose(int** matrix, int matrixRowSize, int* matrixColSize, int* returnSize, int** returnColumnSizes) {

    //I initialize an n x m matrice for storaging transpose of m x n matrice 
    int** output = (int**)malloc((*matrixColSize)*sizeof(int*));
    //Allocating memory for returnColumnSizes
    //This is where we collect lengths of all arrays in our matrice "output"
    *returnColumnSizes = (int*)malloc((*matrixColSize)*sizeof(int));

    //For-Loop for going through on rows of "output" and "matrix" matrices
    //"register" is a keyword for registering the value in CPU registers instead of Memory
    //We do it for accessing the value faster than normal
    //Because of it is stored in CPU registers, it is easier to access to here more than accessing to the normal memory  
    for(register int i = 0;i<(*matrixColSize);i++) {
        //We initialize our 1 x m sized vectors for our transpose matrice "output"
        output[i] = (int*)malloc(matrixRowSize*sizeof(int));
        //Also, we write our m value in appropriate indice in "returnColumnSizes" array
        //We had to wrote it with star because we take the pointer of array pointer (where the data of where array is located) in parameters
        (*returnColumnSizes)[i] = matrixRowSize;
        //Same thing as outer loop but for n sized columns
        for(register int j = 0;j<matrixRowSize;j++) {
            output[i][j] = matrix[j][i];
        }
    }

    //Passing the data of column size (matrixColSize) to returnSize for using the array out of the function
    *returnSize = *matrixColSize;

    return output;
}