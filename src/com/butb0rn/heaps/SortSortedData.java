package com.butb0rn.heaps;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class SortSortedData {

	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(3,-1,2,6,4,5,8);
		sortApproximatelySortedData(iList.iterator(), 3);
	}
	
	public static void sortApproximatelySortedData(Iterator<Integer> seq, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i = 0; i < k && seq.hasNext(); ++i) {
			minHeap.add(seq.next());
		}
		while (seq.hasNext()) {
			minHeap.add(seq.next());
			System.out.println(minHeap.remove());
		}
		while (!minHeap.isEmpty()) {
			System.out.println(minHeap.remove());
		}
	}
}
