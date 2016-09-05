package com.butb0rn.heaps;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class StackWithHeap {
	
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	
	public static void main(String[] args) {
		
		Stacki myStack = new Stacki();
		myStack.push(10);
		myStack.push(1);
		myStack.push(22);
		myStack.push(8);
		myStack.push(0);
		System.out.println(myStack.peek()); 
		System.out.println(myStack.pop());
		System.out.println((myStack.pop()));
		System.out.println(myStack.peek());
		myStack.push(99);
		System.out.println(myStack.peek());
		

	}
	
	private static class ValueWithRank {
		public Integer value;
		public Integer rank;
		
		public ValueWithRank(Integer value, Integer rank) {
			this.value = value;
			this.rank = rank;
		}
	}
	
	private static class Compare implements Comparator<ValueWithRank> {
		@Override
		public int compare(ValueWithRank o1, ValueWithRank o2) {
			return Integer.compare(o2.value, o1.value);
		}
		
		public static final Compare COMPARE_VALUEWITHRANK = new Compare();
	}
	
	public static class Stacki {
		private int timestamp = 0;
		private PriorityQueue<ValueWithRank> maxHeap = new PriorityQueue<>
														(DEFAULT_INITIAL_CAPACITY, Compare.COMPARE_VALUEWITHRANK);
		public void push(Integer x) {
			maxHeap.add(new ValueWithRank(timestamp++, x));
		}
		
		public Integer pop() throws NoSuchElementException {
			return maxHeap.remove().rank;
		}
		
		public Integer peek() {return maxHeap.peek().rank;}
	}

}
