package com.butb0rn.strings;

public class SnakeString {

	public static void main(String[] args) {
		
		String s = new String("Hello World!");
		System.out.println(makeSnakeString(s));

	}
	
	public static String makeSnakeString(String s)  {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < s.length(); i += 4) {
			sb.append(s.charAt(i));
		}
		
		for(int i = 0; i < s.length(); i += 2) {
			sb.append(s.charAt(i));
		}
		
		for(int i = 3; i < s.length(); i += 4) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

}
