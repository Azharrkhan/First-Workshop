package com.bl.workshop;

import java.util.Scanner;

public class Anagram {
	public static void main(StringReverse[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str1 = sc.next();
		String str2 = sc.next();
		
		if(str1.length() == str2.length()) {
		
		if(str1.charAt(0) == str2.charAt(0)) {
			System.out.println("str1 and str2 are anagram");
		}else {
			System.out.println("str1 and str2 are not anagram");
		}
			System.out.println("str1 and str2 are not anagram");
		}
	}
}
