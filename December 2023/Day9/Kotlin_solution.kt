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

    fun inorderTraversal(root: TreeNode?): List<Int> {
        
        val output : MutableList<Int> = mutableListOf()

        iot(root,output)

        return output

    }

    //Inorder Traverse Function
    fun iot(root: TreeNode?, list: MutableList<Int>) {

        if(root != null) {

            iot(root.left,list)

            list.add(root.`val`)

            iot(root.right,list)

        }
    }

}