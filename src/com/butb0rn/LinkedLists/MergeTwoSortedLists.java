package com.butb0rn.LinkedLists;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	
	public static ListNode<Integer> mergeTwoSortedLists(ListNode<Integer> L1, ListNode<Integer> L2) {
		
		ListNode<Integer> headerResult = new ListNode<Integer>(0,null);
		ListNode<Integer> q = headerResult;
		ListNode<Integer> p1 = L1, p2 = L2;
		
		while(p1 != null && p2 != null) {
			
			if(p1.data <= p2.data) {
				q.next = p1;
				p1 = p1.next;
			} else {
				q.next = p2;
				p2 = p2.next;
			}
			q = q.next;
		}
		
		q.next = p1 != null ? p1 : p2;
		return headerResult.next;
	}

}
