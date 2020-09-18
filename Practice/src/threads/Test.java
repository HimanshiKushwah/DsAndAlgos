package threads;

class MyThread extends Thread{
	
	public void start() {
		System.out.println("Start method");
	}
	public void run() {
		System.out.println("run Method");
	}
}

public class Test {
 public static void main(String[] args) {
	 MyThread t = new MyThread();
	 t.start();
	 System.out.println("Main method");
 }
}
