package com.butb0rn.heaps;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ComputeMedianOnlineData {
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	
	public static void main(String[] args) {
		List<Integer> seq = Arrays.asList(1,0,3,5,2,0,1);
		onlineMedian(seq.iterator());

	}
	
	public static void onlineMedian(Iterator<Integer> seq) {
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>( DEFAULT_INITIAL_CAPACITY, 
																		Collections.reverseOrder());
		while(seq.hasNext()) {
			int x = seq.next();
			if(minHeap.isEmpty()) {
				minHeap.add(x);
			} else {
				if (x >= minHeap.peek()) {
					minHeap.add(x);
				} else {
					maxHeap.add(x);
				}
			}
			if (minHeap.size() > maxHeap.size()+1) {
				maxHeap.add(minHeap.remove());
			} else if (minHeap.size() < maxHeap.size()) {
				minHeap.add(maxHeap.remove());
			}
			System.out.println(minHeap.size() == maxHeap.size()
							   ? 0.5 * (minHeap.peek() + maxHeap.peek())
							   : minHeap.peek());
		}
	}
	
	

}
