package practise;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int fact=1;
			for(int j=1;j<=arr[i];j++) {
				fact=fact*j;
			}
			System.out.println(arr[i]+" fact is "+fact);
		}
	}
}

//output:
//	5
//	2
//	1
//	5 fact is 120
//	2 fact is 2
//	1 fact is 1
