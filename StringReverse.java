package com.bl.workshop;

import java.util.Scanner;

public class StringReverse {
	
	void revString() {
		 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string: ");	
		String a = sc.next();
		System.out.println("Original word: "+a);
		System.out.println(a);
		
		for (int i = a.length()-1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}
	}
}
