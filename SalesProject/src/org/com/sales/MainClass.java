package org.com.sales;

public class MainClass {
	
	public static void main(String[] args) {
		
		SalesData d = new SalesData();
		displayGreetings();
		d.display();
		
		
	}
	
	private static void displayGreetings() {
		
		System.out.println("Hello");
		System.out.println("Sales App");
	}

}
