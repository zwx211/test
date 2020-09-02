package com.test001;

import javax.swing.tree.TreeNode;

public class test {
	public static void main(String[] args) {

	}

	public int[] ListOdd(int[] arr) {
		if (arr.length == 0)
			return arr;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				arr[count++] = arr[i];
			}
			return arr;


		}
		return arr;


	}

	public class TreeNode {
		int val;
		TreeNode righ;
		TreeNode left;

		public TreeNode(int x) {
			val = x;        // TODO Auto-generated constructor stub


		}
	}
}

















