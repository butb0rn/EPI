package com.butb0rn.strings;

public class InterconvertStringAndInteger {
	

	public static void main(String[] args) {
		
		System.out.println(intToString(-123));
		System.out.println("6587");
	}
	
	
	public static String intToString(int x) {
		
		boolean isNegative = false;
		if (x < 0) {
			x = -x;
			isNegative = true;
		}
		StringBuilder s = new StringBuilder();
		while (x != 0) {
			s.append((char)('0' + x%10));
			x /= 10;
		}
		
		if (isNegative)
			s.append('-');
		
		s.reverse();
		return s.toString();
	}
	
	public static int stringToInt(String s) {
		
		boolean isNegative = s.charAt(0) == '-';
		int result = 0;
		for (int i = s.charAt(0) == '-' ? 1 : 0; i < s.length(); ++i) {
			
			int digit = s.charAt(i) - '0';
			result = result*10 + digit;
		}
		
		return isNegative ? -result : result;
	}


}

