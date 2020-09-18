package fileInputOutputOperations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		FileWriter fw= new FileWriter("FileWriter.text");
		String s="This Code is for FileWriter, In FileWriter we don't need to create it explicitly.\n FW do it by its own";
		fw.write(s);
		
		FileReader fr= new FileReader("days.text");
		
		int i=fr.read();// its attempts to read first character from the file and return its unicode value thats why we need to typecaste it to char which is done down

		while(i!= -1) {
			System.out.print((char)i);
			i=fr.read();
		}
		System.out.println("********************************************");
		File f= new File("FileDemo.text");
		FileReader fr1= new FileReader(f);
		char[] ch= new char[(int)f.length()];
		
		fr1.read(ch);
		for(char ch1:ch) {
			System.out.print(ch1);
		}
		fw.flush();
		fw.close();
		fr.close();
		fr1.close();
	}

}
