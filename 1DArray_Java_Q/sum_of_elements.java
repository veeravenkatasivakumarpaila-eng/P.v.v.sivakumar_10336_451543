package Arrays;
import java.util.*;
public class sum_of_elements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		var sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
