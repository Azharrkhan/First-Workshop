package com.bl.workshop;

import java.util.Scanner;

public class StringNoOfVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringNoOfVowel ref = new StringNoOfVowel();
		System.out.println("Enter string: ");
	    String a = sc.next();
		ref.countVowel(a);
	}
	
	void countVowel(String a) {
		int count = 0;
		int count1 = 0;
		char myArray[] = {'A', 'E', 'I', 'O', 'U','a', 'e', 'i', 'o', 'u'};
//		a = a.toLowerCase();
//		a = a.toUpperCase();
		
		for (int i = 0; i < a.length(); i++) {
			
			for (int j = 0; j < myArray.length; j++) {
			if(a.charAt(i) == myArray[j]) {
				count++;
			}
			else {
				count1++;
			}
			}
		}
		System.out.println("Total no of vowel are:" +count);
		System.out.println("Total no of consonant are:" +count1);
	}
}
