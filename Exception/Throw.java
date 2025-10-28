package exception;

public class Throw {
    static void checkNumber(int num) {
        if (num < 0) {
            throw new ArithmeticException("Number cannot be negative");
        } else {
            System.out.println("Number is: " + num);
        }
    }

    public static void main(String[] args) {
        checkNumber(5);   // valid
        checkNumber(-10); // throws exception
    }
}


//it will be terminated after (-30) exception is caught it will skip next line
//public class Throw{
//	static void Arithmetic(int num) {
//		if(num<0) {
//			throw new ArithmeticException("neg");
//		}
//		else {
//			System.out.println("pos "+num);
//		}
//	}
//public static void main(String args[]) {
//	try {
//	Throw.Arithmetic(-30);
//	Throw.Arithmetic(30);
//	}
//	catch(Exception e) {
//		System.out.println("caught"+e);
//	}
//}
//}

//output:caughtjava.lang.ArithmeticException: neg



//to execute both the statements
//public class Throw{
//	static void Arithmetic(int num) {
//		if(num<0) {
//			throw new ArithmeticException("neg");
//		}
//		else {
//			System.out.println("pos "+num);
//		}
//	}
//public static void main(String args[]) {
//	try {
//	Throw.Arithmetic(-30);
//	}
//	catch(Exception e) {
//		System.out.println("caught"+e);
//	}
//	
//	try {
//		Throw.Arithmetic(30);
//		}
//		catch(Exception e) {
//			System.out.println("caught"+e);
//		}
//}
//}
//
//output:/
//caughtjava.lang.ArithmeticException: neg
//pos 30
