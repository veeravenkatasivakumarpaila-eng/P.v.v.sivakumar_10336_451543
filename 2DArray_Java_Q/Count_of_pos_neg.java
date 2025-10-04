package practise;

import java.util.Scanner;

public class Count_of_pos_neg {

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
		int positive_count=0;
		int negative_count=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(arr[i][j]>=0) {
					positive_count+=1;
				}
				else {
					negative_count+=1;
				}
			}
		}
		System.out.println("No.of positives in matrix is: "+positive_count);
		System.out.println("No.of negatives in matrix is: "+negative_count);
    }
}

//output:
//	Enter no.of rows:
//		3
//		Enter no.of cols:
//		3
//		Enter the elements
//		19 -9 24
//		-2 -4 10
//		-67 6 7
//		No.of positives in matrix is: 5
//		No.of negatives in matrix is: 4
