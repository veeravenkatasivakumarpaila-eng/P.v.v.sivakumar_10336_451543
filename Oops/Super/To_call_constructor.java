//package variabe;
//
//class Pa{
//	Pa(){
//		System.out.println("parent");
//	}
//}
//class Ch extends Pa{
//	Ch(){
//		super();
//		System.out.println("child");
//	}
//}
//public class To_call_constructor {
//	public static void main(String[] args) {
//	Ch c=new Ch();
//	}
//}
//
//output:
//	parent
//	child

package variabe;

class Pa{
	Pa(String name){
		System.out.println("parent "+name);
	}
}
class Ch extends Pa{
	Ch(String name){
		super(name);
		System.out.println("child "+name);
	}
}
public class To_call_constructor {
	public static void main(String[] args) {
	Ch c=new Ch("akhi");
	}
}
