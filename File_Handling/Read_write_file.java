package file;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
public class Read_write_file {

	public static void main(String[] args) {
		try {
			File ob=new File("example.txt");
			if(ob.createNewFile()) {
				System.out.println("file is created "+ob.getName());
			}
			else {
				System.out.println("file already exist");
			}
			FileWriter writer=new FileWriter(ob);
			writer.write("Hi I Am Akhila");
			writer.close();
			
			Scanner reader=new Scanner(ob);
			while(reader.hasNextLine()) {
				String data=reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
