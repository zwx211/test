package com.test001;

import javax.swing.tree.TreeNode;

//import com.sun.jdi.Value;

public class MirrorTree {
	public class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) {
			value = x;
			// TODO Auto-generated constructor stub
		}
	}
	public TreeNode MirrorTre(TreeNode root) {
		if(root == null) {
			return null;
		}
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		MirrorTre(root.left);
		MirrorTre(root.right);
		return root;
		
	}

}
