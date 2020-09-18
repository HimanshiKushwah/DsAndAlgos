package threads;


class Demo2 implements Runnable{
	public void run(){
		for(int i=0;i<10;i++) {
		System.out.println("Child Thread");
		}
	}
}
public class Demo1  {
	public static void main(String[] args) {
		
		Demo2 d= new Demo2();
		Thread t= new Thread(d);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Parent Thread");
			}
		

	}

}
