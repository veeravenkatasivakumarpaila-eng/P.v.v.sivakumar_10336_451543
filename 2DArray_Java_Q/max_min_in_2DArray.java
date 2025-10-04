package practise;

import java.util.*;

public class max_min_in_2DArray {

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
		int max=arr[0][0];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
		}
		System.out.println("The max element is: "+max);
		int min=arr[0][0];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(min>arr[i][j]) {
					min=arr[i][j];
				}
			}
		}
		System.out.println("The min element is: "+min);
	}
}

//output:
//	Enter no.of rows:
//		3
//		Enter no.of cols:
//		3
//		Enter the elements
//		81 42 90
//		64 11 21
//		96 29 34
//		The max element is: 96
//		The min element is: 11
