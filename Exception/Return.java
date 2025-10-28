package exception;

public class Return {
	public static int retu() {
	try {
		int a=10/0;
	}catch(Exception e){
		System.out.println("hi");
		return 10;
	}
	finally {
		System.out.println("hello");
		return 20;
	}
}
	public static void main(String[] args) {
     System.out.println(retu());

	}

}

//output:
//	hi
//	hello
//	20
