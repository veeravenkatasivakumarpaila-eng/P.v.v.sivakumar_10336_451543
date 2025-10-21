package practise_oops;

import java.util.Scanner;

class Account{
	private int balance;
	private String name;
	public void setmethod(int b,String n) {
		this.balance=b;
		this.name=n;
	}
	public void getmethod() {
		System.out.println(balance);
		System.out.println(name);
	}
}
public class Encapsulation{
	public static void main(String[] args) {
		Account a= new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter balance:");
		int d=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name:");
		String c=sc.nextLine();
		a.setmethod(d,c);
		a.getmethod();
	}
}
//output:
//	enter balance:
//		5000
//		enter name:
//		abc
//		5000
//		abc





//package practise_oops;
//
//class Account{
//	private int balance;
//	private String name;
//	public void setmethod(int b,String n) {
//		balance=b;
//		name=n;
//	}
//	public void getmethod() {
//		System.out.println(balance);
//		System.out.println(name);
//	}
//}
//public class Encapsulation{
//	public static void main(String[] args) {
//		Account a= new Account();
//		a.setmethod(2,"akhi");
//		a.getmethod();
//	}
//}

//output:
//	2
//	akhi

//package practise_oops;
//
//class Account{
//	private int balance;
//	private String name;
//	public void setmethod(int balance,String name) {
//		this.balance=balance;
//		this.name=name;
//	}
//	public void getmethod() {
//		System.out.println(balance);
//		System.out.println(name);
//	}
//}
//public class Encapsulation{
//	public static void main(String[] args) {
//		Account a= new Account();
//		a.setmethod(2,"akhi");
//		a.getmethod();
//	}
//}

//package practise_oops;
//
//class Account{
//	private int balance;
//	private String name;
//	public void setmethod(int balance,String name) {
//		this.balance=balance;
//		this.name=name;
//	}
//	public int getbalance() {
//		return balance;
//	}
//	public String getname() {
//		return name;
//	}
//}
//public class Encapsulation{
//	public static void main(String[] args) {
//		Account a= new Account();
//		a.setmethod(2,"akhi");
//		System.out.println(a.getbalance());
//		System.out.println(a.getname());
//	}
//}


//class ecomerce{
//	String product_name;
//	int id;
//	public void setdetails(String p,int id) {
//		this.product_name=p;
//		this.id=id;
//	}
//	public void getdetails() {
//		System.out.println(id);
//		System.out.println(product_name);
//	}
//}
//public class Encapsulation{
//	public static void main(String[] args) {
//		ecomerce e=new ecomerce();
//		e.setdetails("xyz",1);
//		e.getdetails();
//	}
//}

//class student{
//	private int rollno;
//	private String name;
//	public void settermethod(int r,String n) {
//		this.rollno=r;
//		this.name=n;
//	}
//	public int getrollno() {
//		return rollno;
//	}
//	public String getname() {
//		return name;
//	}
//}
//public class Encapsulation{
//	public static void main(String[] args) {
//		student s=new student();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter no.of students:");
//		int a=sc.nextInt();
//		sc.nextLine();
//		
//		student arr[]=new student[a];
//		for(int i=0;i<a;i++) {
//			arr[i]=new student();
//			System.out.println("enter the rollno: ");
//			int r=sc.nextInt();
//			sc.nextLine();
//			System.out.println("enter the name: ");
//			String n=sc.nextLine();
//			arr[i].settermethod(r,n);
//		}
//		for(int i=0;i<a;i++) {
//			System.out.println("student rollno at "+(i+1)+" is: "+arr[i].getrollno());
//			System.out.println("student name at "+(i+1)+" is: "+arr[i].getname());
//		}
//	}
//}
//
//output:
//	enter no.of students:
//		3
//		enter the rollno: 
//		12
//		enter the name: 
//		akhi
//		enter the rollno: 
//		13
//		enter the name: 
//		joshi
//		enter the rollno: 
//		14
//		enter the name: 
//		madhu
//		student rollno at 1 is: 12
//		student name at 1 is: akhi
//		student rollno at 2 is: 13
//		student name at 2 is: joshi
//		student rollno at 3 is: 14
//		student name at 3 is: madhu
//
