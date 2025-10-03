import java.util.Scanner;

public class Sort_array_ascending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter the elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array after sorting in ascending is: ");
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
//		Array after sorting in ascending is: 
//		1
//		2
//		7
//		8
//		9
