
public class ReverseString {
	
	public static void main(String[] args) {
		String s="himanshi";
		byte[] newString=s.getBytes();
		byte[] s1=new byte[newString.length];
		for(int i=0;i<newString.length;i++) {
			for(int j=newString.length-1;j>=0;j--) {
				s1[i]=s1[j];
			}
		}
		System.out.println(s1);
	}

}
