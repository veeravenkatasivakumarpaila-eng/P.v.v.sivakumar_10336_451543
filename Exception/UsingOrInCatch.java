package exception;

public class UsingOrInCatch {

	public static void main(String[] args) {
		try {
		    int a = 5 / 0;
		} catch (ArithmeticException | NullPointerException e) {
		    System.out.println("Caught Exception "+e);
		}
		finally {
			System.out.println("finally");
		}
	}

}

//output:
//	Caught Exception java.lang.ArithmeticException: / by zero
//	finally
