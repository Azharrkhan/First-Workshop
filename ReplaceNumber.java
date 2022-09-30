package com.bl.workshop;

import java.util.Scanner;

public class ReplaceNumber {
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		ReplaceNumber rr = new ReplaceNumber();
		rr.replacingNumber(a);
	}
	
	public void replacingNumber(int a[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to replace:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the new value that you want to replace desired value :");
		int num2 = sc.nextInt();
		
		int i;
		for  (i = 0; i < a.length; i++) {
		
		if (a[i] == num1) {
			num1 = num2;
			a[i] = num2;
			System.out.println("array after replacement");
			for(i = 0; i < a.length; i++) {
				System.out.print( a[i]+" ");
			}
		}
		}
	}
//			System.out.println("Match not found");
	}

