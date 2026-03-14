class Solution {
    public TreeNode searchBST(TreeNode root, int val) {

        // base case
        if (root == null || root.val == val) {
            return root;
        }

        // search left subtree
        if (val < root.val) {
            return searchBST(root.left, val);
        }

        // search right subtree
        return searchBST(root.right, val);
    }
}