package com.bl.workshop;

public class ArraySegregation {
	public static void main(String[] args) {
		ArraySegregation se = new ArraySegregation();
			se.segregate();
	}
	public void segregate() {
		int[] a = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1};

		int i;
		int count = 0;
		for (i = 0; i < a.length; i++) {
			if(a[i] == 0)
				count++;
		} 
		System.out.println("No of Zeros:" +count);
		for (i = 0; i < count; i++) {
			a[i] = 0;
		}
		
		for(i = count; i < a.length; i++) 
			a[i] = 1;
		
		System.out.println("Array after segregation: ");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
