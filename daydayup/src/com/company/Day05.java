package com.company;

import javax.swing.*;

public class Day05 {
    //对称二叉树，首先定义一个二叉树
    public class  TreeNode{
         TreeNode right;
         TreeNode left;
         int val;
         public TreeNode(int x){
             val = x;
         }

    }
    public boolean sameTree(TreeNode root){
        if(root==null){
            return true;
        }
        return dfs(root.left,root.right);
    }
    //递归方法
    public boolean dfs(TreeNode left,TreeNode right){
        if(left==null&&right ==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.val!= right.val){
            return false;
        }
        return dfs(left.left,right.right)&&dfs(left.right,right.left);

        }
        //public boolean isSymmetric(TreeNode root){


        }
       // return dfs(left.left,left.right)&&dfs()



