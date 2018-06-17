package com.arrays;

public class ReorganizeTheArray {
	
	public static void main(String[] args) {
		int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		int[] arr1= rearrange(arr);
		for(int a : arr1) {
			System.out.print(a+" ");
		}
	}

	private static int[] rearrange(int[] arr) {
		boolean[] arrboo = new boolean[256];
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=-1){
				arrboo[arr[i]] = true;
			}
			
		}
		for(int i =0;i<arr.length;i++) {
			
			if(arrboo[i]) {
				arr[i] = i;
			}else {
				arr[i] = -1;
			}
		
			
		}
		return arr;
	}

}
