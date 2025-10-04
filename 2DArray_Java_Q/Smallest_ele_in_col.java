package practise;

import java.util.*;;

public class Smallest_ele_in_col {

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
			int smallest=arr[0][i];
			for(int j=0;j<cols;j++) {
				if(smallest>arr[j][i]) {
					smallest=arr[j][i];
				}
			}
			System.out.println("The smallest element in column "+i+" is "+smallest);
		}
   }
}

//output:
//	Enter no.of rows:
//		3
//		Enter no.of cols:
//		3
//		Enter the elements
//		89 32 90
//		23 71 24
//		67 12 42
//		The smallest element in column 0 is 23
//		The smallest element in column 1 is 12
//		The smallest element in column 2 is 24
