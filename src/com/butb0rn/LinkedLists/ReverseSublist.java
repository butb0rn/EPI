package com.butb0rn.LinkedLists;

public class ReverseSublist {

	public static void main(String[] args) {
		ListNode<Integer> L;
		L = new ListNode<>(1, new ListNode<>(2, new ListNode<>(3,
				new ListNode<>(4, new ListNode<>(5, null)))));
		ListNode<Integer> result = reverseSublist(L, 2, 4);

		while (result != null) {
			System.out.println(result.data);
			result = result.next;
		}

	}

	public static ListNode<Integer> reverseSublist(ListNode<Integer> L,
			int start, int finish) {
		if (start == finish) { // No need to reverse since start == finish.
			return L;
		}

		ListNode<Integer> dummyHead = new ListNode<>(0, L);
		ListNode<Integer> sublistHead = dummyHead;
		int k = 1;
		while (k++ < start) {
			sublistHead = sublistHead.next;
		}
		// Reverse sublist.
		ListNode<Integer> sublistIter = sublistHead.next;
		while (start++ < finish) {
			ListNode<Integer> temp = sublistIter.next;
			System.out.println("temp ~>" + temp.data);
			sublistIter.next = temp.next;
			System.out.println("sublistIter.next ~>" + sublistIter.next.data);
			temp.next = sublistHead.next;
			System.out.println("temp.next" + temp.next.data);
			sublistHead.next = temp;
			System.out.println("sublistHead.next" + sublistHead.next.data);
			System.out.println("start" + start);
		}
		return dummyHead.next;
	}

}
