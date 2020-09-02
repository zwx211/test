package com.company;

import java.util.ArrayList;
import java.util.List;

public class Day13 {
    public class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            value = x;
        }
    }
      static  List<List<Integer>> list = new ArrayList();
    public List<List<Integer>> levelOrder(TreeNode root) throws Exception {
        recur(root,0);
        return list;


    }
    public static  void recur(TreeNode root ,int k) throws Exception{
        if(root!= null){
            if(list.size()<=k){
                list.add(new ArrayList<>());
            }
            list.get(k).add(root.value);
            recur(root.left,k);
            recur(root.right,k);
        }
    }
}
