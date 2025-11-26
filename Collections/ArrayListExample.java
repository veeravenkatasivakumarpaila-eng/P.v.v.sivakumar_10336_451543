package collections;

import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> ab=new ArrayList<>();
		ab.add(10);
		ab.add(3);
		ab.add(54);
		ab.add(24);
		System.out.println("Using for each loop");
		for(Integer i:ab) {
			System.out.println(i);
		}
		System.out.println("Using for each() method with Lambda function");
		ab.forEach(i->System.out.println(i));
		System.out.println("using stream");
		ab.stream().filter(i->i>3).forEach(i->System.out.println(i));
		System.out.println("Using iterator with next");
		Iterator<Integer> it=ab.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("using iterator with previous");
		ListIterator<Integer> ti=ab.listIterator();
		while(ti.hasNext()) {
			System.out.println("forward:"+ti.next());
		}
		System.out.println("Now moving backward:");
		while(ti.hasPrevious()) {
			System.out.println("backward:"+ti.previous());
		}	
	}
}
