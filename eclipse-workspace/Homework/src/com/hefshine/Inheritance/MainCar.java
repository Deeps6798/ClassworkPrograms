package com.hefshine.Inheritance;

public class MainCar extends DifferentInheriCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferentInheriCar m =new DifferentInheriCar();
		m.chasisno=4000159;
		m.brand="Roylls Royce";
		m.name="RC";
		m.cost=5976776;
			
		
		System.out.println(m.chasisno);
		System.out.println(m.brand);
		System.out.println(m.name);
		System.out.println(m.cost);
		
			m.Displays();
		

	}

}
