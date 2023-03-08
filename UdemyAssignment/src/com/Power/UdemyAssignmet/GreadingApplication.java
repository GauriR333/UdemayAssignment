package com.Power.UdemyAssignmet;

import java.util.Scanner;

public class GreadingApplication {

	public static void main(String[] args) {
		System.out.println("Enter marks  ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Maths: ");
		int maths = sc.nextInt();
		System.out.print("Physics: ");
		int physics = sc.nextInt();
		System.out.print("Chemistry: ");
		int chemistry = sc.nextInt();
		if (maths < 100 && physics < 100 && chemistry < 100) {
			int average = maths + physics + chemistry / 3;
			System.out.println("avreage" + average);

			if (maths < 35 || physics < 35 || chemistry < 35 && average < 35) {
				System.out.println("Sorry, you are fail!!!");
			} else if (average >= 35) {
				System.out.print("you are pass ");
				if (average <= 59) {
					System.out.print("with c grade");
				} else if (average <= 69) {
					System.out.print("with B grade");
				} else {
					System.out.print("with A grade");
				}
			}
			
		} else {
			System.out.println("Markes should be white in 100");
		}

	}
}
