package practise_oops;

public class class_object {
	int num;
	String name;
	void show() {
		System.out.println("num "+num);
		System.out.println("name "+name);
	}

	public static void main(String[] args) {
		class_object ob=new class_object();
		ob.num=10;
		ob.name="akhila";
		ob.show();
		class_object ob2=new class_object();
		ob2.num=20;
		ob2.name="joshi";
		ob2.show();
	}
}
//Each object has its own copy of variables.This is the correct way to represent two separate entities (objects).
//output:
//	num 10
//	name akhila
//	num 20
//	name joshi




//class_object ob = new class_object();
//ob.num = 10;
//ob.name = "akhila";
//ob.show();
//
//ob.num = 20;
//ob.name = "joshi";
//ob.show();
//You changed its data after the first display.One object, values overwritten
//output:
//	num 10
//	name akhila
//	num 20
//	name joshi
	
