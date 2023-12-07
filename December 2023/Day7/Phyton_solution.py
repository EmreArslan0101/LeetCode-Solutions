class Solution(object):
    def largestOddNumber(self, num):
        """
        :type num: str
        :rtype: str
        """
        #For creating a reverse for loop, we use -1 as third parameter of range function
        for i in range(len(num)-1,-1,-1):
            #We check if the num[i] is odd if it is one char of "13579"
            if num[i] in "13579":
                #We truncnate out string with string[startIndex:endIndex+1] in whatever length as we want
                return num[0:i+1]

        #If there is no odd value, we just return blank string
        return ""

        