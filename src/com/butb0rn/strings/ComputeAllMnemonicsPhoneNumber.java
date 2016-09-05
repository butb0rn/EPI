package com.butb0rn.strings;

import java.util.ArrayList;
import java.util.List;

public class ComputeAllMnemonicsPhoneNumber {

	public static void main(String[] args) {
		
		List<String> result = phoneMnemonic("023");
		for (String word : result) {
			System.out.println(word);
		}

	}
	
	public static List<String> phoneMnemonic(String phoneNumber) {
		char[] partialMnemonic = new char[phoneNumber.length()];
		List<String> mnemonic = new ArrayList<>();
		phoneMnemonicHelper(phoneNumber, 0, mnemonic, partialMnemonic);
		return mnemonic;
	}
	
	public static final String[] MAPPING =
		{"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
	
	
	public static void phoneMnemonicHelper(String phoneNumber, int digit, List<String> mnemonic, char[] partialMnemonic) {
		
		if (digit == phoneNumber.length()) {
			mnemonic.add(new String(partialMnemonic));
		}
		else {
			for (int i = 0; i < MAPPING[phoneNumber.charAt(digit) - '0'].length(); ++i) {
				
				char c = MAPPING[phoneNumber.charAt(digit) - '0'].charAt(i);
				partialMnemonic[digit] = c;
				phoneMnemonicHelper(phoneNumber, digit+1, mnemonic, partialMnemonic);
			}
		}
		
	}

}
