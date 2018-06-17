package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RearrangeToFormBiggestNumber {

	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(54);
		arr.add(546);
		arr.add(60);
		arr.add(548);
		rearrange(arr);
		
		  List<String> nums1= Arrays.asList(args);
		
	}

	private static void rearrange(List<Integer> arr) {
		
		Collections.sort(arr, new Comparator<Integer>() {
			 @Override
		        public int compare(Integer X, Integer Y) {
				 
				 String X1 = String.valueOf(X); 
				 String Y1 = String.valueOf(Y); 
				 String XY = X1+Y1;
				 String YX = Y1+X1;
			  return YX.compareTo(XY);
			 	}
		});
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
}
