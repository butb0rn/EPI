package com.butb0rn.LinkedLists;

public class RemoveDuplicatesFromASortedList {

	public static void main(String[] args) {

	}
	
	public static ListNode<Integer> RemoveDuplicates(ListNode<Integer> L) {
		ListNode<Integer> iter = L;
		while(iter != null) {
			ListNode<Integer> nextDistinct = iter.next;
			while (nextDistinct != null && nextDistinct.data == iter.data) {
				nextDistinct = nextDistinct.next;
			}
			iter.next = nextDistinct;
			iter = nextDistinct;
		}
		return L;
	}

}
