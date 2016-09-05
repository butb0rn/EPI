package com.butb0rn.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SampleOfflineData {

	public static void main(String[] args) {
		
		List<Integer> randSample = Arrays.asList(3,7,5,11);
		randSampling(3,randSample);
		System.out.println(randSample); 
	}
	
	public static void randSampling(int k, List<Integer> A) {
		
		Random gen = new Random();
		for (int i = 0; i < k; ++i) {
			
			Collections.swap(A, i, i + gen.nextInt(A.size()-i));
		}
	}

}
