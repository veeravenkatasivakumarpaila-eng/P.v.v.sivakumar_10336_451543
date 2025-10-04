package practise;

import java.util.*;

public class Sum_of_all_elements_in_matrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter no.of cols: ");
		int cols=sc.nextInt();
		int sum=0;
		System.out.println("Enter the elements");
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				sum=sum+arr[i][j];
			}
		}
	System.out.println("The sum of all elements in a matrix is: "+sum);
}
}

//output:
//	Enter no.of cols: 
//		4
//		Enter the elements
//		1 2 3 4 
//		5 6 7 8 
//		9 10 11 12
//		The sum of all elements in a matrix is: 78
