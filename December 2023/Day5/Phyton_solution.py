class Solution(object):
    def numberOfMatches(self, n):
        """
        :type n: int
        :rtype: int
        """
        return n-1
        """ 
            > We will return n-1 in this function
            > Because if we iterate over all of the cases, we will have 1 team in the end
            and n-1 matches
            > For example, lets take 7
            > In first iteration, we will seperate 7 as 3 matches ((n - 1) / 2) and 4 (((n - 1) / 2)+1) teams to next round
            > The outputs of operations are always floored like (7-1)/2 = 3 except (7-1)/2 = 3.5
            > In second one, we will seperate 4 as 2 (n/2) mathces and 2 (n/2) teams
            > In the last iteration, we will have seperate 2 as 1 match and 1 team
            > And we will end our iteration here, because there is no more team to challenge
            > Total matches are : 3+2+1 = 6
            > n - 1 = 7 - 1 = 6  
        """