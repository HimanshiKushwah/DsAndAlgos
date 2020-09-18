package fileInputOutputOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("BufferedDemo");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.write("ear");
		bw.newLine();
		String s="Zindagi";
		bw.write(s);
		bw.newLine();
		char[] ch= {'a','b','c','d'};
		bw.write(ch);
		bw.flush();
		bw.close();
	}

}
