package com.butb0rn.LinkedLists;

public class ListNode<T> {
	
	public T data;
	public ListNode<T> next;
	
	 ListNode(T data, ListNode<T> next) {
		    this.data = data;
		    this.next = next;
	 }
}
