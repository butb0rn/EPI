package com.butb0rn.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComputeNextPermutation {

	public static void main(String[] args) {
		
		List<Integer> permList = Arrays.asList(6,2,1,5,4,3,0);
		System.out.println(nextPermutation(permList));

	}
	
	public static List<Integer> nextPermutation(List<Integer> perm) {
		
		int k = perm.size() - 2;
		
		while(k >= 0 && perm.get(k) >= perm.get(k+1)) {
			--k;
		}
		
		if (k == -1) {
			return Collections.emptyList();
		}
		
		for( int i = perm.size()-1; i > k; --i) {
			if(perm.get(i) > perm.get(k)) {
				Collections.swap(perm, k, i);
				break;
			}
		}
		return perm;
	}

}
