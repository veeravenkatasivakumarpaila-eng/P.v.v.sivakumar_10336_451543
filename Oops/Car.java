package paractise;

import java.util.*;

public class Car {
	String model;
	int price;
	int quantity;
	String booking_date;
	int a;
	void accept_details() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter model: ");
		model=sc.nextLine();
		System.out.println("Enter price: ");
		price=sc.nextInt();
		System.out.println("Enter quantity: ");
		quantity=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter booking_date: ");
		booking_date=sc.nextLine();
	}
	void calculate() {
		a=price*quantity;
		System.out.println(a);
	}
	void display() {
		System.out.println("Entered car model "+model+" ,price "+price+" ,quantity "+quantity+" ,booking_date "+booking_date+" total "+a);
	}

	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();
		System.out.println("Enter car details:");
		c1.accept_details();
		c2.accept_details();
		c1.calculate();
		c2.calculate();
		System.out.println("The details you entered are:");
		c1.display();
		c2.display();
	}

}
