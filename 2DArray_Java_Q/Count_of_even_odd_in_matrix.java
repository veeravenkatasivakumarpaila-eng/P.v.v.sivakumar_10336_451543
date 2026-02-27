
package practise;

import java.util.*;

public class Count_of_even_odd_in_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter no.of cols: ");
		int cols=sc.nextInt();
		int even_count=0;
		int odd_count=0;
		System.out.println("Enter the elements: ");
		int arr[][]=new int[rows][cols];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(arr[i][j]%2==0) {
					even_count+=1;
				}
				else {
					odd_count+=1;
				}
			}
		}
		System.out.println("Even count of elements in matrix is: "+even_count);
		System.out.println("odd count of elements in matrix is: "+odd_count);
	}
}
	
//output:
//	Enter no.of rows: 
//		3
//		Enter no.of cols: 
//		4
//		Enter the elements: 
//		1 2 3 4 
//		5 6 7 8 
//		9 10 11 11
//		Even count of elements in matrix is: 5
//		odd count of elements in matrix is: 7

