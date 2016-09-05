package com.butb0rn.BinaryTrees;

public class BinaryTreeNode<T> {
	
	public T data;
	public BinaryTreeNode<T> left, right;
	
	BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
		    this.data = data;
		    this.left = left;
		    this.right = right;
	 }
}
