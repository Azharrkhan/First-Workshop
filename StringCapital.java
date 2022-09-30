package com.bl.workshop;

import java.util.Scanner;

public class StringCapital {
	public static void main(String[] args) {
//			int a=25;
//			static int c = 10;
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter string: ");	
			String a = sc.next();
			String word[] = a.split(a);
			String capitalizedWord = "";
			for (String w : word) {
				String first = w.substring(0);
				String afterFirst = w.substring(1);
				capitalizedWord += first.toUpperCase()+afterFirst;
			}
			System.out.println(capitalizedWord);
//			System.out.println(a.toUpperCase());
//			System.out.println(a.toLowerCase());
			}
		}
