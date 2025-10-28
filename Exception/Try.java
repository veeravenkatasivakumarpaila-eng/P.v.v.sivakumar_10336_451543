package exception;

public class Try {

	public static void main(String[] args) {
		try{
			int a=10/0;
		}catch (Exception e) {
		    System.out.println("Catch");
		}
		finally {
			System.out.println("finally");
		}
	}

}
