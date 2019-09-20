public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
 
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
       return isMirror(root,root);
    }
    public boolean isMirror(TreeNode a, TreeNode b){
        if (b == null && b == null) return true;
        if (a == null || b == null) return false;
        return (a.val == b.val) && isMirror(a.right, b.left) && isMirror(a.left, b.right);
    }
}
