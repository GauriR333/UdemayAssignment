package com.Power.UdemyAssignmet;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean PrimeFlag = false;
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				PrimeFlag = true;
			} 
		}
		if (PrimeFlag != true) {
			System.out.println("Prime No: " + n);
		} else {
			System.out.println("Not Prime no: " + n);
		}
	}
}
