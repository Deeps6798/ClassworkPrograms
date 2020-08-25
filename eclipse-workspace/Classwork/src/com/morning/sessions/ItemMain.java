package com.morning.sessions;

import java.util.Scanner;

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Objects : ");
		int cnt=0;
		cnt=sc.nextInt();
		Item it[] = new Item[cnt];
		for(int i=0; i<it.length; i++)
		{
			it[i]= new Item();
			System.out.println("Enter id: ");
			it[i].iid=sc.nextInt();
			System.out.println("Enter item name: ");
			it[i].iname=sc.next();
			System.out.println("Enter item doe: ");
			it[i].idoe=sc.next();
			System.out.println("enter item count: ");
			it[i].cnt=sc.nextInt();
		}
		for(int i=0; i<it.length; i++)
		{
			System.out.println(it[i]);
		}

		//Code for updating the array of objects
		System.out.println("Enter the id fof the objecr that u want to enter");
		int tid=0;
		tid=sc.nextInt();
		Item t= new Item();
		System.out.println("Enter Upadted data o objects");
		
		
		t.iid=tid;
		
	
	}

}





