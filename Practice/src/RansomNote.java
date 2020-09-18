import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {
	public static void ransomNote(String rn,String mz) {
		Map<Character,Integer>hm=new HashMap<Character,Integer>();
		Map<Character,Integer>hm1=new HashMap<Character,Integer>();
		for(int i=0,len=rn.length();i<len;i++) {
			char ch=rn.charAt(i);
			if(hm.containsKey(ch)) {
				int rnFreq=hm.get(ch);
				hm.put(ch,rnFreq+1);
			}
			else {
				hm.put(ch,1);
			}
		}
		for(int i=0,len=mz.length();i<len;i++) {
			char ch=mz.charAt(i);
			if(hm1.containsKey(ch)) {
				int mzFreq=hm1.get(ch);
				hm1.put(ch,mzFreq+1);
			}
			else {
				hm1.put(ch,1);
			}
		}
		for(int i=0;i<mz.length();i++) {
			char ch=rn.charAt(i);
			char ch1=mz.charAt(i);
			if((hm.containsValue(ch)&& hm.containsKey(ch))==(hm1.containsValue(ch1)&& hm1.containsKey(ch1))) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
	}
	public static void main(String[] args) {

		String rn="aa",mz="aab";
		ransomNote(rn, mz);
	}
}
