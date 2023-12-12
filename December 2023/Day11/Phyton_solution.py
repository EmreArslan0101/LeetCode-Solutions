class Solution(object):
    def findSpecialInteger(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """

        currCount = 1

        for i in range(1,len(arr)):

            if arr[i-1] == arr[i]:
                currCount += 1
            else:
                currCount = 1

            if currCount > (len(arr) >> 2):
                return arr[i]
                
        return arr[0]
        