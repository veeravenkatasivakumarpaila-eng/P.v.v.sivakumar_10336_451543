package Arrays;

import java.util.*;
public class Even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5,6,7};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" is even");
			}
			else {
				System.out.println(a[i]+" is odd");
			}
		}

	}

}

// output:
// 1 is odd
// 2 is even
// 3 is odd 
// 4 is even
// 5 is odd 
// 6 is even
// 7 is odd 
