package fileInputOutputOperations;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		int count=0;
		File f= new File("abc.text");
		f.createNewFile();
		System.out.println(f.getAbsolutePath());
		File one= new File("/srv");
		one.createNewFile();
		String[] s= one.list();
		for(String s1:s) {
			File s2=new File(one,s1);
			if(s2.isDirectory()){
				count++;
				System.out.println(s1);
			}
			
		}
		System.out.println(one.getAbsolutePath());
		System.out.println("No of directories "+count);
		System.out.println("********************************************");
		int count1=0;
		for(String s1:s) {
			File s2= new File(one,s1);
			if(s2.isFile()) {
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("No of files "+count1);
		
		
//Or File f3= new File(f1,"FileDemo.text");

		}

}
