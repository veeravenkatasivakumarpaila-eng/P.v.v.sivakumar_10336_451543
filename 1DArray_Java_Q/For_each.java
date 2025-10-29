package practise;

import java.util.Scanner;

public class For_each {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of values:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the values:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int copy[]=arr.clone();
		System.out.println("Entered values are:");
		for(int i:copy) {
			System.out.println(i);
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
	}

}
