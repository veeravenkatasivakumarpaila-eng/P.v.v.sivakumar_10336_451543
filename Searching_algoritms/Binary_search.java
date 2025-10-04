package practise;
import java.util.*;
public class Binary_search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int a=sc.nextInt();
		int arr[]=new int[5];
		
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("Soretd array is: "+Arrays.toString(arr));
		
		System.out.println("Enter the key element to search");
		int key=sc.nextInt();
		int result=Binarysearch(arr,key);
		if(result==-1) {
			System.out.println("element not found");
		}
		else {
			System.out.println("element"+key+" found at index "+result);
		}

	}
public static int Binarysearch(int arr[],int key) {
	int left = 0;
	int right=arr.length-1;
	while(left<=right) {
		int mid=(left+right)/2;
		if(arr[mid]==key) {
			return mid;
		}
		else if(key>arr[mid]) {
			left=mid+1;
		}
		else {
			right=mid-1;
		};
	}
	return-1;
}
}

//output:
//	Enter the elements
//	8 10 14 55 2
//	Soretd array is: [2, 8, 10, 14, 55]
//	Enter the key element to search
//	55
//	element55 found at index 4
