package com.butb0rn.LinkedLists;

public class CyclicallyRightShiftList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ListNode<Integer> cyclicallyRightShiftList(ListNode<Integer> l, int k) {
		
		if (l == null)
			return l;
		
		ListNode<Integer> tail = l;
		int count = 1;
		while (tail.next != null) {
			tail = tail.next;
			++count;
		}
		
		k %= count;
		if (k == 0) {
			return l;
		}
		
		tail.next = l;
		int stepToNewHead = count - k;
		ListNode<Integer> newTail = tail;
		while (stepToNewHead-- > 0) {
			newTail = newTail.next;
		}
		
		ListNode<Integer> newHead = newTail.next;
		newTail.next = null;
		return newHead;	
	}
}
