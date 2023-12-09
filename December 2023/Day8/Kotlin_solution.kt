/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    //We will run it recursionally
    fun tree2str(root: TreeNode?): String {
        
        //If the leaf we hade gone to is null, we will return null string for when a NULL pointer passed in
        if(root == null) {
            return ""
        }

        //For left-first cases, we check if there is a left child
        if(root.left != null) {
            //If there is a left child, we check for right child
            if(root.right != null) {
                //If the both children are here, we return case of "root(left)(right)"
                return ""+root.`val`+"("+tree2str(root.left)+")("+tree2str(root.right)+")"
            }
            else {
                //If there is just left child here, we return case of "root(left)"
                return ""+root.`val`+"("+tree2str(root.left)+")"
            }
        }

        //For right-first cases, we check if there is a right child
        if(root.right != null) {
            //If there is a right child, we check for left child
            if(root.left != null) {
                //If the both children are here, we return case of "root(left)(right)"
                return ""+root.`val`+"("+tree2str(root.left)+")("+tree2str(root.right)+")";
            }
            else {
                //If there is just right child here, we return case of root()(right)"
                return ""+root.`val`+"()("+tree2str(root.right)+")";
            }
        }

        //If there is no child; we are at a leaf, we just return the value for ending recursion for the branch
        return root.`val`.toString();

    }
}