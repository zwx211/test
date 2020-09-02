package com.company;

import java.util.Stack;

public class Day04 {
    //实现一个二叉树 二叉树的镜像
    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int x) {
            val = x;
        }

        //递归
        public TreeNode mirrorTree(TreeNode root) {
            if (root == null) {
                return null;
            } else {
                TreeNode tmp = root.left;
                root.left = root.right;
                root.right = tmp;
                mirrorTree(root.left);
                mirrorTree(root.right);

            }
            return root;
        }

        public void mirrorTree1(TreeNode root) {
            if (root != null) {
                //return null;

                Stack<TreeNode> st = new Stack<>();
                st.push(root);
                while (!st.empty()) {
                    TreeNode node = st.pop();
                    TreeNode tmp = node.left;
                    node.left = node.right;
                    node.right = node;
                    if (node.left != null) {
                        st.push(node.left);
                    }
                    if (node.right != null) {
                        st.push(node.right);
                    }
                }


            }

        }

        public static void main(String[] args) {
            TreeNode root = null;
            //root.mirrorTree();

        }


    }
}

