package arrays;

import java.util.*;

public class sum_of_elements_key {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int num=sc.nextInt();
		int a[]=new int[num];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter key element");
		int key=sc.nextInt();
		int sum=0;
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			   sum=a[i]+a[j];
			   if(sum==key) {
					System.out.println("key "+key+" key found at indexes "+i+" and "+j);
					found=true;
				}
			}
			if(!found) {
				System.out.println("No pairs found with sum equal to the key");
			}
		}

	}
}
