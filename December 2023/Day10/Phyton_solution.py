class Solution(object):
    def transpose(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[List[int]]
        """

        #Inline for loop structure is like "{returnedValue} for {iterationValue} in {iterableValue}"
        output = [[0 for i in range(len(matrix))] for i in range(len(matrix[0]))]

        for i in range(len(output)):
            for j in range(len(output[0])):
                output[i][j] = matrix[j][i]

        return output


        