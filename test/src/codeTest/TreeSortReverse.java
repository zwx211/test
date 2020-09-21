package codeTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeSortReverse {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public void TreeNode(int x){
            this.val = x;
        }

    }
    public List<List<Integer>> treeSort(TreeNode root){
        List<List<Integer>> list = new LinkedList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list1 = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i<size;i++){
                TreeNode node = queue.poll();
                list1.add(node.val);
                TreeNode left = node.left;
                TreeNode right = node.right;
                if(left!=null){
                    queue.offer(left);

                }
                if(right!=null){
                    queue.offer(right);
                }




            }
            list.add(0,list1);


        }
        return list;
    }

    public static void main(String[] args) {



    }
}
