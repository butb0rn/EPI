package com.butb0rn.BinaryTrees;

public class BinaryTreeHeightBalanced {

	public static void main(String[] args) {

//		BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(1, 
//				new BinaryTreeNode<>(2, new BinaryTreeNode<>(4, 
//						new BinaryTreeNode<>(5, 
//								new BinaryTreeNode<>(6, null, null) , null) , null), null), 
//				new BinaryTreeNode<>(3, null, null));
//		System.out.println(isBalanced(tree));		
	}
	
	public static boolean isBalanced(BinaryTreeNode<Integer> tree) {
		
		if (checkHeight(tree) == -1)
			return false;
		else return true;
	}
	
	public static int checkHeight(BinaryTreeNode<Integer> tree) {
		
		if (tree == null) 
			return 0;
		
		int leftSide = checkHeight(tree.left);
		if (leftSide == -1)
			return -1;
		
		int rightSide = checkHeight(tree.right);
		if (rightSide == -1)
			return -1;
		
		if (Math.abs(leftSide-rightSide) > 1)
			return -1;
		else
			return Math.max(leftSide, rightSide) + 1;
	}

}
