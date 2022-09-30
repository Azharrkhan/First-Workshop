package com.bl.workshop;

import java.util.Scanner;

public class Sept22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = sc.next();
		System.out.println("Enter the char you want to search");
		char ch = sc.next().charAt(0);
		Sept22 sp = new Sept22();
		sp.charCheck(string, ch);
		
	}

	public void charCheck(String string, char ch) {
		int count = 0;
		string = string.toLowerCase();
		
		for (int i = 0; i < string.length(); i++) {
		if (string.charAt(i) == ch) {
			count++;
		}
	}
		if (count == 0) {
			System.out.println("No match found");
		}
		else {
		System.out.println("Count of mathcing character is: "+count);
		}
	}
}
