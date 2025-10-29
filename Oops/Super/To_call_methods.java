package variabe;
class Parent{
	void display() {
		System.out.println("parent");
	}
}
class Child extends Parent{
	void child(){
		super.display();
		System.out.println("child");
	}
}
public class To_call_methods {

	public static void main(String[] args) {
		Child c=new Child();
		c.child();

	}

}


//package variabe;
//class Parent{
//	int num;
//	int display() {
//		return num;
//	}
//}
//class Child extends Parent{
//	int num;
//	int child(){
//		int pa=super.display(); //super.display(); if we give like this only the child num is returned o/p will be 10
//		System.out.println(pa);
//		return num;
//	}
//}
//public class To_call_methods {
//
//	public static void main(String[] args) {
//		Child c=new Child();
//		c.num=10;
//		System.out.println(c.child());
//	}
//}

//output:
//	0
//	10

//package variabe;
//class Parent{
//	void display() {
//		System.out.println("parent");
//	}
//}
//class Child extends Parent{
//	void display(){
//		System.out.println("child");
//	}
//	void child_display() {
//		display();
//		super.display();
//	}
//}
//public class To_call_methods {
//
//	public static void main(String[] args) {
//		Child c=new Child();
//		c.child_display();
//	}
//}

//output:
//	child
//	parent

//package variabe;
//class Parent{
//	int num=10;
//	void display() {
//		System.out.println("parent "+num);
//	}
//}
//class Child extends Parent{
//	int num=101;
//	void display(){
//		System.out.println("child "+num);
//	}
//	void child_display() {
//		display();
//		super.display();
//	}
//}
//public class To_call_methods {
//
//	public static void main(String[] args) {
//		Child c=new Child();
//		c.child_display();
//	}
//}
//
//output:
//	child 101
//	parent 10
