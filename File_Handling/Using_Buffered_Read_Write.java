package file;
import java.io.*;
public class Using_Buffered_Read_Write {

	public static void main(String[] args){
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter("example.txt"));
			bw.write("hi");
			bw.newLine();
			bw.write("I am Teppala Akhila");
			bw.close();
			
			BufferedReader br=new BufferedReader(new FileReader("example.txt"));
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
