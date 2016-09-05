package com.butb0rn.BinaryTrees;

public class BinaryTreeSymmetric {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(1, 
				new BinaryTreeNode<>(2, null, new BinaryTreeNode<>(5, null, null)), 
				new BinaryTreeNode<>(2, new BinaryTreeNode<>(5, null, null), null));
		System.out.println(isSymmetric(tree.left, tree.right) || tree == null);		

	}
	
	public static boolean isSymmetric(BinaryTreeNode<Integer> t1, BinaryTreeNode<Integer> t2) {
		
		if(t1 == null && t2 == null) {
			return true;
		} else if (t1 != null && t2 != null) {
			
			if (t1.data != t2.data) 
				return false;
			return isSymmetric(t1.left, t2.right) && isSymmetric(t1.right, t2.left);
		}
		return false;
	}

}
