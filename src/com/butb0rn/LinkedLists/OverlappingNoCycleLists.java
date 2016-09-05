package com.butb0rn.LinkedLists;

public class OverlappingNoCycleLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ListNode<Integer> overlappingNoCycleLists(ListNode<Integer> l1, ListNode<Integer> l2) {
		
		int lenghtL1 = length(l1), lengthL2 = length(l2);
		
		if(lenghtL1 > lengthL2) {
			l1 = advancedListByK(lenghtL1 - lengthL2, l1);
		}
		else {
			l2 = advancedListByK(lengthL2 - lenghtL1, l2);
		}
		
		while(l1 != null && l2 != null && l1 != l2) {
			l1 = l1.next;
			l2 = l2.next;
		}
		
		return l2;
	}
	
	public static int length(ListNode<Integer> l) {
		if (l == null)
			return 0;
		int count = 0;
		while(l != null) {
			count++;
			l = l.next;
		}
		return count;
	}
	
	public static ListNode<Integer> advancedListByK(int count, ListNode<Integer> l) {
		
		while (count-- > 0) {
			l = l.next;
		}
		return l;
	}

}
