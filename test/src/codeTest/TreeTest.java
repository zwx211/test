package codeTest;

public class TreeTest {
    public class  TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        public void TreeNode(int x){
            this.val = val;

        }
    }
    public int maxDep(TreeNode root){
        if(root==null){
            return  0;
        }
        return 1+Math.max(maxDep(root.left),maxDep(root.right));

    }
}
