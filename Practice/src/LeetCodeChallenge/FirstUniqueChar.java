package LeetCodeChallenge;

public class FirstUniqueChar {
	public static void firstUniqueChar(String s) {
		int len=s.length();
		if(len==0) {
			System.out.println("-1");
		}else {
			int i;
			for(i=0;i<len;i++) {
				int j=1;
				while(j<len) {
					if(s.charAt(i)!=s.charAt(j)) {
						j++;
					}
					else {
						i++;
					}
				}
				break;
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		String s="";
		firstUniqueChar(s);

	}

}
