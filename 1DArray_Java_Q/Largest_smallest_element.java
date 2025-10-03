package practise;

import java.util.*;

public class Largest_smallest_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter the elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		System.out.println("Largest element in the array is: "+largest);
		System.out.println("Smallest element in the array is: "+smallest);
	}
}

//output:
//	Enter number of elements: 
//		6
//		Enter the elements: 
//		7
//		97
//		5
//		-3
//		-1
//		7
//		Largest element in the array is: 97
//		Smallest element in the array is: -3
