/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

int* inorderTraversal(struct TreeNode* root, int* returnSize) {

    //We will initialize a pointer for an integer array we will return
    //We will initalize it with size of 1*sizeof(int)
    //In that way we will prevent more crashes and create more memory safe app
    int* output = (int*)malloc(4);
    *returnSize = 1;

    //Inorder Traverse Function
    void iot(struct TreeNode* root) {
        
        if(root) {

            iot(root->left);

            //We add our value to end of the array
            output[(*returnSize)-1] = root->val;

            //Increase length value holder as one because we added a value
            (*returnSize)++;

            //We enlarge the output array for next value additions
            output = (int*)realloc(output,(*returnSize)*4);

            iot(root->right);

        }

    }

    iot(root);

    //Because we initialized our array with size of 1...
    //... and we hold that length value in returnSize pointer
    //We must decrease it as one for letting our output read correctly by the machine
    (*returnSize)--;

    return output;
    
}