import java.util.*;
public class Reversed_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter the elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int b=arr.length-1;
		for(int i=0;i<arr.length/2;i++,b--) {
				int temp=arr[i];
				arr[i]=arr[b];
				arr[b]=temp;
		}
		System.out.println("Reversed array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}

//output:
//	Enter number of elements: 
//		5
//		Enter the elements: 
//		7
//		8
//		9
//		2
//		1
//		Reversed array is: 
//		1
//		2
//		9
//		8
//		7
