class Solution(object):
    def largestGoodInteger(self, num):
        """
        :type num: str
        :rtype: str
        """

        """ 
            Firstly, I initialized an variable for our digit values of the output string
            If output string is XXX, value of the output variable is X
            We initialized it as -1, because range of possible X values is 0 <= X <= 9 and this range doesn't include -1
            We will use -1 for understanding if there is 3-same digit value or not 
        """
        output = -1

        for i in range(0,len(num)-2):
            if num[i] is num[i+2] and num[i] is num[i+1]:
                """
                    Initialized a variable that holds our current value that we are on...
                """
                curr = num[i]
                """ 
                    ...and compare with the old value
                    If old value is smaller than the current value, we equalize the new value to old value 
                """
                if output < curr:
                    output = curr

        """ 
            If our initial value hasn't changed (If it is -1), we return blank string that means there is no 3-same digit value
            If our initial value has changed (If it is any number but -1), we return blank string that means there is 3-same digit value 
        """
        return "" if output == -1 else output*3
