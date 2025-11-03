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


public class Deserialization {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fi = new FileInputStream("serial.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			
			Student s=(Student) oi.readObject();
			oi.close();
			fi.close();
			System.out.println("Object has been deserialized successfully!");
            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
