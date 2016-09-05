package com.butb0rn.stacks_queues;

import java.util.Deque;
import java.util.LinkedList;

public class EvaluateRPNExpression {

	public static void main(String[] args) throws IllegalAccessException {
		System.out.println(eval("3,4,+,2,*,1,+"));

	}
	
	public static int eval(String RPNExpression) {
		
		Deque<Integer> intermediateResult = new LinkedList<Integer>();
		String delimiter = ",";
		String[] symbols = RPNExpression.split(delimiter);
		for(String token : symbols) {
			if (token.length() == 1 && "+-*/".contains(token)) {

				int y = intermediateResult.removeFirst();
				int x = intermediateResult.removeFirst();
				switch(token.charAt(0)) {
				case '+':
					intermediateResult.addFirst(x+y);
					break;
				case '-':
					intermediateResult.addFirst(x-y);
					break;
				case '*':
					intermediateResult.addFirst(x*y);
					break;
				case '/':
					intermediateResult.addFirst(x/y);
					break;
				}
			}
			else {
				intermediateResult.addFirst(Integer.parseInt(token));
			}
		}
		return intermediateResult.removeFirst();
	}

}
