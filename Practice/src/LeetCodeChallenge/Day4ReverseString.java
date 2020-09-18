package LeetCodeChallenge;

class Day4ReverseString{
    public static void reverseString(char[] s){
    	int len=s.length;
        int size=len/2,j=len-1,i=0;
        while(i<size) {
            while(j>=size) {
               if(s[i]!=s[j]) {
            	   char ch=s[i];
            	   s[i]=s[j];
            	   s[j]=ch;
            	   i++;
            	   j--;
               }
               else {
            	   i++;
            	   j--;
               }
            }
            
        }
        print(s);
    }
    public static void print(char[] ch) {
    	for(char a1:ch) {
    		System.out.print(a1+" ");
    	}
    }
    public static void main(String[] args){
    	char[] ch={'h','e','n','n','a','k'};
    	reverseString(ch);
        
    }
}
