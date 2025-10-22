package practise_oops;

class Hr{
	void scolding(){
		System.out.println("Hr is scolding");
	}
}
class Employee extends Hr {
	void me() {
		System.out.println("me");
	}
	void dis() {
	    System.out.println("Welcome");
	}
	dis();

}
public class Inheritance{
	public static void main(String[] args) {
		Employee s=new Employee();
		s.scolding();
		s.me();
		dis();
	}
}
