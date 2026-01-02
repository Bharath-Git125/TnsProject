package com.Tns.javaPractices.arrayConcpt;

public class multiDimensionArray {

	public static void main(String[] args) {
		/*int arr[][]= new int[3][3];
		arr[0][0]=10;
		arr[0][1]=20;
	}*/

		int arr[][]= {{1,2,3},{4,5,6}};
		System.out.println(arr.length);
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

		}
	}
}
