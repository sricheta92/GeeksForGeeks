package com.arrays;

public class RearrangeArrayAsPerIndex {
	
	public static void main(String[] args) {
		int[] arr = {50, 40, 70, 60, 90};
		int [] index = {3,  0,  4,  1,  2};
		rearrange(arr,index);
	}

	private static void rearrange(int[] arr, int[] index) {
		
		int[] temp = new int[arr.length];
		
		int count =0;
		for(int i :arr) {
			temp[count] = i;
		    count++;
		}
		
		
		for(int i=0;i<index.length;i++) {
			arr[index[i]] =  temp[i];
		}
		
		for(int j: arr) {
			System.out.print( j +" ");
		}
		
	}

}
