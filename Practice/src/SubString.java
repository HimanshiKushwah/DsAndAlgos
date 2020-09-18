import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubString {
	public static void subString(String[] s) {
		int len=s.length;
		int sum=(len*(len+1))/2;
		int total =sum+1;
		
		System.out.println("Total no of subStrings are:- "+total);
	}
	public static void subStr(String[] s,int l) {
		
		for(int i=1;i<=l;i++) {
			for(int j=0;j<=l-i;j++) {
				int k=j+i-1;
				for(int m=j;m<=k;m++) {
				System.out.print(s[m]);
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String[] s= {"a","b","c"};
		subString(s);
		subStr(s,s.length);
	}

}
