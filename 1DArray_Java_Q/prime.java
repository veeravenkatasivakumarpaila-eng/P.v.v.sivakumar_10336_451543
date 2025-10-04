package Arrays;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count=count+1;
				}
			}
			if(count==2) {
				System.out.println(a[i]+" is prime");
			}
			else {
				System.out.println(a[i]+" is not prime");
			}
		}
	}
}

// output:
// 1
// 2
// 3
// 4
// 5
// 6
// 1 is not prime
// 2 is prime    
// 3 is prime    
// 4 is not prime
// 5 is prime    
// 6 is not prime
