# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    #We will run it recursionally
    def tree2str(self, root):
        """
        :type root: TreeNode
        :rtype: str
        """

        #If there is a root we will return normal case values
        if root:
            #For left-first cases, we check if there is a left child
            if root.left:
                #If there is a left child, we will check for right child
                if root.right:
                    #If the both children are here, we return case of "root(left)(right)"
                    return "{}({})({})".format(root.val, self.tree2str(root.left), self.tree2str(root.right))
                else:
                    #If there is just left child here, we return case of "root(left)"
                    return "{}({})".format(root.val, self.tree2str(root.left))

            #For right-first cases, we check if there is a right child
            if root.right:
                #If there is a right child, we check for left child
                if root.left:
                    #If the both children are here, we return case of "root(left)(right)"
                    return "{}({})({})".format(root.val, self.tree2str(root.left), self.tree2str(root.right))
                else:
                    #If there is just right child here, we return case of root()(right)"
                    return "{}()({})".format(root.val, self.tree2str(root.right))

            #If there is no child; we are at a leaf, we just return the value for ending recursion for the branch
            return str(root.val)
    
        else:
            #If the leaf we hade gone to is null, we will return null string for when a NULL pointer passed in
            return ""