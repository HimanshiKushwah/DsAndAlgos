import java.util.Scanner;

public class Mode {

	public static void main(String[] args) {
		int a[]= new int[10];
		int maxcount=0,maxvalue=0, count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			count=0;
			for(int j=0;j<10;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount=count;
				maxvalue=a[i];
			}
		}
		System.out.println("mode of the given values is:- "+ maxvalue);
		
	}

}
