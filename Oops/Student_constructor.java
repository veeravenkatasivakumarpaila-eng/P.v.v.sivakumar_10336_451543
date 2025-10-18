//package practise_oops;
//
//class student {
//	int num;
//	String name;
//	student(int num,String name){
//		this.num=num;
//		this.name=name;
//	}
//	void display() {
//		System.out.println("num:"+num+" name:"+name);
//	}
//}
//public class Student_constructor {
//	public static void main(String[] args) {
//		student ob = new student(1,"akhi");
//		ob.display();
//   }
//}

//output:
//	num:1 name:akhi

//or

//package practise_oops;
//
//public class Student_constructor {
//	int num;
//	String name;
//	Student_constructor(int num,String name){
//		this.num=num;
//		this.name=name;
//	}
//	void display() {
//		System.out.println("num:"+num+" name:"+name);
//	}
//	public static void main(String[] args) {
//		Student_constructor ob = new Student_constructor(1,"akhi");
//		ob.display();
//
//	}
//}

//output:
//	num:1 name:akhi

package practise_oops;
public class Student_constructor{
	String email;
	String password;
	
	Student_constructor(String email,String password){
		this.email=email;
		this.password=password;
	}
	void show() {
		System.out.println("email:"+email);
		System.out.println("password:"+password);
	}
public static void main(String[] args) {
	Student_constructor ob=new Student_constructor("xyz","abc");
	ob.show();
	}
}
