package exception;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		try{
			int arr[]=new int[5];
			arr[10]=76;
		}catch (Exception e) {
		    System.out.println("Catch "+e);
		}
		finally {
			System.out.println("finally");
		}
	}

}

//output:
//	Catch java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
//	finally
