
package practise;

import java.util.Arrays;
import java.util.Scanner;

public class Search_using_BinarySearch_method {

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
		Arrays.sort(copy);
		System.out.println("After sorting: ");
		for(int i:copy) {
			System.out.println(i);
		}
		System.out.println("Enter number to search:");
		int m=sc.nextInt();
		int index=Arrays.binarySearch(copy, m);
		if(index>=0) {
			System.out.println("found at "+index);
		}
		else {
			System.out.println("not found "+index);
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
	}
}

output:
	Enter no.of values:
		4
		Enter the values:
		87 45 90 12
		Entered values are:
		87
		45
		90
		12
		After sorting: 
		12
		45
		87
		90
		Enter number to search:
		87
		found at 2
