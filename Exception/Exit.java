package exception;

public class Exit {

	public static void main(String[] args) {
		try{
			System.exit(0);
		}catch (Exception e) {
		    System.out.println("Catch");
		}
		finally {
			System.out.println("finally");
		}
	}

}

//output:nothing is printed even the finallyblock isnot printed
//as system.exit is used to terminate the JVM
