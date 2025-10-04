package practise;

import java.util.Scanner;

public class Largest_ele_in_row {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter no.of cols:");
		int cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		System.out.println("Enter the elements");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			int largest=arr[i][0];
			for(int j=0;j<cols;j++) {
				if(largest<arr[i][j]){
					largest=arr[i][j];
				}
			}
			System.out.println("The largest element in row "+i+" is "+largest);
		}

	}
}

//output:
//	Enter no.of rows:
//		3
//		Enter no.of cols:
//		3
//		Enter the elements
//		90 12 47
//		21 89 78
//		54 61 121
//		The largest element in row 0 is 90
//		The largest element in row 1 is 89
//		The largest element in row 2 is 121
