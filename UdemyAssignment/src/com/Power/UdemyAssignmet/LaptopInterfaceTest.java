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
	HoNootbook hpn1=new HoNootbook();
	hpn1.click();
	System.out.println("After hpnootbook");
	DellNootbook dn1=new DellNootbook();
	dn1.click();
	System.out.println("After dellnootbook");
}
}
