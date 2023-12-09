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
 * @return {string}
 */
//We will run it recursionally
var tree2str = function(root) {

    //If the leaf we hade gone to is null, we will return null string for when a NULL pointer passed in
    if(!root) return "";

    //For left-first cases, we check if there is a left child
    if(root.left) {
        //If there is a left child, we check for right child
        if(root.right) {
            //If the both children are here, we return case of "root(left)(right)"
            return `${root.val}(${tree2str(root.left)})(${tree2str(root.right)})`
        }
        else {
            //If there is just left child here, we return case of "root(left)"
            return `${root.val}(${tree2str(root.left)})`
        }
    }

    //For right-first cases, we check if there is a right child
    if(root.right) {
        //If there is a right child, we check for left child
        if(root.left) {
            //If the both children are here, we return case of "root(left)(right)"
            return `${root.val}(${tree2str(root.left)})(${tree2str(root.right)})`
        }
        else {
            //If there is just right child here, we return case of root()(right)"
            return `${root.val}()(${tree2str(root.right)})`
        }
    }

    //If there is no child; we are at a leaf, we just return the value for ending recursion for the branch
    return root.val.toString();
};