import java.util.HashMap;
import java.util.Map;

public class JewelAndStone {
	public static int findJewel(String J,String S) {
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0,len=S.length();i<len;++i) {
			char ch=S.charAt(i);
			if(hm.containsKey(ch)) {
				int charFreq=hm.get(ch);
				hm.put(ch,charFreq+1);
			}
			else {
				hm.put(ch,1);
			}
		}
		int count=0;
		for(int i=0,len=J.length();i<len;i++) {
			char ch=J.charAt(i);
			if(hm.containsKey(ch)) {
				count+=hm.get(ch);
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		String J = "aA", S = "aAAbbbb";
		System.out.println(findJewel(J,S));
	}

}
