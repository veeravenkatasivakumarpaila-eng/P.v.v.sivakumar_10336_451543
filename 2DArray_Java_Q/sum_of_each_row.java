package practise;

import java.util.*;

public class sum_of_each_row {

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
			int sum=0;
			for(int j=0;j<cols;j++) {
				sum=sum+arr[i][j];
			}
			System.out.println("The sum of row "+i+" is "+sum);
		}
	}

}

//output:
//	Enter no.of rows:
//		3
//		Enter no.of cols:
//		3
//		Enter the elements
//		4 7 2
//		1 8 9
//		1 3 1
//		The sum of row 0 is 13
//		The sum of row 1 is 18
//		The sum of row 2 is 5

	
