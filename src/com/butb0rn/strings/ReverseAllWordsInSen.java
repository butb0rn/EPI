package com.butb0rn.strings;

public class ReverseAllWordsInSen {

	public static void main(String[] args) {
		
		String sen = "Hi My n is e h SAN";
		String[] sen_words = sen.split(" ");
		int sen_len = sen_words.length;
		int i = 0;
		int j = sen_len-1;
		while (i < sen_len/2) {
			String z = sen_words[i];
			sen_words[i] = sen_words[j];
			sen_words[j] = z;
//			swapWords(sen_words[i], sen_words[j]);
			i += 1;
			j -= 1;
		}
		
		
		for(String word : sen_words) {
			System.out.print(word + " ");
			
		}
	}
	public static void swapWords(String x, String y) {
		
		String z = x;
		x = y;
		y = z;
	}
}
