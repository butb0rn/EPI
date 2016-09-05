package com.butb0rn.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteDupplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> arrayList = Arrays.asList(1,2,2,2,3,4,4,6);
		A.addAll(arrayList);
		System.out.println(deleteDuplicates(A));
	}
	
	public static int deleteDuplicates(List<Integer> A) {
		if(A.isEmpty())
			return 0;
		int writeIndex = 1;
		for (int i = 1; i < A.size(); ++i) {
			if(!A.get(writeIndex-1).equals(A.get(i))) {
				A.set(writeIndex++, A.get(i));
			}	
		}
		return writeIndex;
	}

}
