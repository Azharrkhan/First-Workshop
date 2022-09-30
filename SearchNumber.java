package com.bl.workshop;

import java.util.Scanner;

public class SearchNumber {
	public static void main(String[] args) {
		
	int[]a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	SearchNumber sr = new SearchNumber();
	sr.searchNumber(a);
	}
	
	public void searchNumber(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number youn want to search: ");
		int num = sc.nextInt();
		int i;
		int temp = 0;
		for (i = 0; i < a.length; i++) {
		if( a[i] == num) {
			temp++;
		}
		if (temp != 0) {
			System.out.println("Match is found");
		}else {
			System.out.println("Match not found");
		}
		}
	}
}

