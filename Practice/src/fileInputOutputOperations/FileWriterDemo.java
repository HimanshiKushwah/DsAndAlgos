package fileInputOutputOperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("fwDemo.text",true);
		String fileSeperator= System.getProperty("file.separator");
		fw.write("\n");
		fw.write(100);
		fw.write("ear\nZindagi");//\n line separator
		char[] ch= {'a','b','c'};
		fw.write("\n");
		fw.write(ch);
		fw.flush();
		fw.close();
		
	}

}
