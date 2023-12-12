class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max1Indice = 0 
        max2Indice = 0

        for i in range(1,len(nums)):
            if nums[i] > nums[max1Indice]:
                max1Indice = i
            
        

        if max1Indice == 0:
            max2Indice += 1
        
        for i in range(1,len(nums)):
            if i == max1Indice : continue
            if nums[i] > nums[max2Indice]:
                max2Indice = i

        return (nums[max1Indice]-1)*(nums[max2Indice]-1)
        