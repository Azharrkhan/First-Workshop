package com.bl.workshop;

import java.security.PublicKey;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ArrayDemo {
	public static void main(String[] args) {
		ArrayDemo arr = new ArrayDemo();
		int[] a = new int[10];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;
		arr.display(a);
//		arr.revDisplay(a);
		arr.arrSum(a);
		arr.max(a);
	}
	
private void display(int[] a) {
	int i = 0;
	while(i < a.length) {
		System.out.println(a[i]);
		i++;
	}
//	for (int i = 0; i < a.length; i++) {
//		System.out.println(a[i]);
//		}	
	}

//private void revDisplay(int[] a) {
//	for (int i = a.length-1; i >= 0; i--) {
//		System.out.println(a[i]);
//		}	
//	}
private void arrSum(int[]a) {
	int sum = 0;
	int i = 0;
	while(i < a.length) {
		sum = sum + a[i];
		i++;
	}
	System.out.println("Sum is:" +sum);
}
//	for (int i=0; i < a.length; i++)
//	sum = sum + a[i];
//	System.out.println("Sum of array elements is: " +sum);
	
	private void max(int[]a){
		 int max = a[0];
		for (int i = 0; i <a.length; i++) {
			if (max < a[i]) {
			max= a[i];
		}
		}
		System.out.println("Max is: " +max);
}
}


