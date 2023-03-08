package com.Power.UdemyAssignmet;

public class LaptopInterfaceTest {
public static void main(String[] args) {
	HP hp1=new HP();
	hp1.click();
	hp1.Scoll();
	System.out.println("After HP");
	DELL dell1=new DELL();
	dell1.click();
	dell1.Scoll();
	System.out.println("After DELL");
}
}
