
package practise;

import java.util.Scanner;

public class Display_diagonals {

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
			for(int j=0;j<cols;j++) {
				if(i==j) {
					System.out.println("The first pair of diagonal elements are: "+arr[i][j]);
				}
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(i+j==cols-1) {
					System.out.println("The second pair of diagonal elements are: "+arr[i][j]);
				}
			}
	  }
  }
}

//output:
//	Enter no.of rows:
//		4
//		Enter no.of cols:
//		4
//		Enter the elements
//		1 2 3 4
//		5 6 7 8 
//		9 10 11 12
//		13 14 15 16
//		The first pair of diagonal elements are: 1
//		The first pair of diagonal elements are: 6
//		The first pair of diagonal elements are: 11
//		The first pair of diagonal elements are: 16
//		The second pair of diagonal elements are: 4
//		The second pair of diagonal elements are: 7
//		The second pair of diagonal elements are: 10
//		The second pair of diagonal elements are:
