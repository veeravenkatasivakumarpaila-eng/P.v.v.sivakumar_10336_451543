package exception;

public class Nesting_Try_Catch {

	public static void main(String[] args) {
		try {
		    try {
		        int a = 10 / 0;
		    } catch (ArithmeticException e) {
		        System.out.println("Inner catch");
		    }
		} catch (Exception e) {
		    System.out.println("Outer catch");
		}

	}

}

//output:Inner catch

//package exception;
//
//public class UsingOrInCatch {
//
//	public static void main(String[] args) {
//		try {
//		    try {
//		        int a = 10 / 0;
//		    } catch (NullPointerException e) {
//		        System.out.println("Inner catch");
//		    }
//		} catch (Exception e) {
//		    System.out.println("Outer catch");
//		}
//
//	}
//
//}

//output:Outer catch
