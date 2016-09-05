package com.butb0rn.searching;

import java.util.Arrays;
import java.util.List;

public class SearchFirstOfK {

	public static void main(String[] args) {
		
		List<Integer> arr = Arrays.asList(-14,-10,2,108,108,243,285,285,285,401);
//		System.out.println(searchFirstOfK(arr, 285));
		System.out.println(searchFirstOfKRec(arr, 285, 0, arr.size()-1));
	}
	
	public static int searchFirstOfK(List<Integer> A, int k) {
		
		int left = 0, right = A.size() -1, result = -1;
		while(left <= right) {
			
			int mid = left + (right - left) / 2;
			if (A.get(mid) < k) {
				left = mid+1;
			}
			else if(A.get(mid) == k) {
				result = mid;
				right = mid -1;
			}
			else {
				right = mid-1;
			}
		}
		return result;
	}
	
	public static int searchFirstOfKRec(List<Integer> arr, int target, int min, int max) {
		int mid = min+(max-min)/2;
		if (min > max)
			return -1;
		if (arr.get(mid) == target) {
			int result = mid;
			if(arr.get(mid-1) == target) {
				result = searchFirstOfKRec(arr, target, min, mid-1);
			}
			return result;
		} else if (arr.get(mid) > target) {
			return searchFirstOfKRec(arr, target, min, mid-1);
		} else {
			return searchFirstOfKRec(arr, target, mid+1, max);
		}
	}

}
