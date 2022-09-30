package com.bl.workshop;

public class SecondhighestElement {
	public static void main(String[] args) {
		int[] a = {6, 9, 3, 77, 98, 54, 10, 15, 50, 75,};
//		SecondhighestElement ref =  new SecondhighestElement();
//		ref.secondHighestElement(a);
		
	}
	public void secondHighestElement(int[]a) {
		for (int i = 0; i < a.length; i++) {
			int max = 0;
			if(max < a[i]) {
				max = a[i];
				System.out.println(max);
			}
		}
	}
}
