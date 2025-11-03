package practise;

import java.io.*;
class Student implements Serializable{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class Serialization {
	public static void main(String[] args) throws IOException {
		try {
			Student s=new Student(1,"akhi");
			FileOutputStream fo=new FileOutputStream("serial.txt");
			ObjectOutputStream ob=new ObjectOutputStream(fo);
			
			ob.writeObject(s);
			ob.close();
			fo.close();
			System.out.println("Object has been serialized successfully!");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
