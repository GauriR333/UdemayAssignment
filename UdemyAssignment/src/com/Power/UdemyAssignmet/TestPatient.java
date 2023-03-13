package com.Power.UdemyAssignmet;

public class TestPatient {
public static void main(String[] args) {
	EncapsulationPatient p1 = new EncapsulationPatient();
	p1.setId(101);
	p1.setName("Dagadu");
	p1.setSsn("pune"); 
	System.out.println("id: "+p1.getId());
	System.out.println("Name: "+p1.getName());
	System.out.println("Ssn: "+p1.getSsn());
}
}
