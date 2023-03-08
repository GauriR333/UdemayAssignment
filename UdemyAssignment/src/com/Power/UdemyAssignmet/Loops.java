package com.Power.UdemyAssignmet;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			if (num > 100) {
				break;
			}
			if (i % 10 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
