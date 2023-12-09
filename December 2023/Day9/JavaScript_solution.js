/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var inorderTraversal = function(root) {
    
    const output = [];

    //Inorder Traverse Function
    const iot = root => {

        if(!root) return;

        iot(root.left);

        output.push(root.val);

        iot(root.right);

    }

    iot(root);

    return output;

};