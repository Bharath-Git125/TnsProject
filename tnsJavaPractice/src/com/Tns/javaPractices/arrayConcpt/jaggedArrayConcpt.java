package com.Tns.javaPractices.arrayConcpt;

public class jaggedArrayConcpt {

	public static void main(String[] args) {
		int jagged [][]= {{1,2,3},{5,6,7,8,9},{3,4}};
		
		for(int[] i : jagged) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
