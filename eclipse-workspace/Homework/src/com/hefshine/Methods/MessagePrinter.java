package com.hefshine.Methods;

public class MessagePrinter {
	
	void printMessage(String name)
	{
		System.out.println("Web developer");
	}

	public static void main(String[] args) {
		
		MessagePrinter m= new MessagePrinter();
		m.printMessage(args[0]);
		
		
		
		

	}

}
