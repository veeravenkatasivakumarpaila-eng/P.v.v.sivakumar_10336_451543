package variabe;

class parent{
	int a=10;
}
class child extends parent{
	int a=10;
	void display() {
		System.out.println(a);
		System.out.println(super.a);
	}
}


public class To_call_variables {
	public static void main(String[] args) {
		child c=new child();
		c.display();

	}

}
