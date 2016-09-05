package com.butb0rn.strings;

public class ComputeSpreadsheetColmunEncoding {

	public static void main(String[] args) {
		
		//System.out.println(ssDecodeColId("ZZ"));
		String test = "A";
		System.out.println(test.charAt(0)+0);
	}
	
	public static int ssDecodeColId(final String col) {
		
		int res = 0;
		for (int i = 0; i < col.length(); i++) {
			char c = col.charAt(i);
			res = res * 26 + c - 'A' + 1;
		}
		return res;
	}

}
