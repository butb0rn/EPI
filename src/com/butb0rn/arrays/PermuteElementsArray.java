package com.butb0rn.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermuteElementsArray {
	
	public static void main(String[] args) {
		
		List<String> a = Arrays.asList("a","b","c","d");
		List<Integer> perm = Arrays.asList(2,0,1,3);
		applyPermutation(perm, a);
		
		for(int i=0; i<a.size(); i++)
			System.out.println(a.get(i));
		
	}
	
	public static void applyPermutation(List<Integer> perm, List<String> A) {
		
		for (int i = 0; i < A.size(); ++i) {
			
			int next = i;
			while (perm.get(next) >= 0) {
				Collections.swap(A, i, perm.get(next));
				int temp = perm.get(next);
				perm.set(next, perm.get(next) - perm.size());
				next = temp;
			}
		}
		
		for (int i = 0; i < perm.size(); i++) {
			
			perm.set(i, i + perm.size());
		}
	}
}
