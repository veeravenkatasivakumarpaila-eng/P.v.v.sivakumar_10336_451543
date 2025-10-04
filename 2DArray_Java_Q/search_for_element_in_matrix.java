import java.util.*;

public class search_for_element_in_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter no.of cols: ");
		int cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		boolean found=false;
		System.out.println("Enter the values: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the key: ");
		int key=sc.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(key==arr[i][j]) {
					System.out.println("found key "+key+" at indexes "+i+" and "+j);
					found=true;
				}
			}
			}
		if(!found) {
			System.out.println("Not found");
		}
		
	}
}

//output:
//	Enter the values: 
//		1 2 3 4
//		5 6 7 8
//		9 10 11 12
//		Enter the key: 
//		10
//		found key 10 at indexes 2 and 1
