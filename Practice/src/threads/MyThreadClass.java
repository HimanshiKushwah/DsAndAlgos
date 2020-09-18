package threads;

class Threading implements Runnable{
	public void run() {
		System.out.println("Using runnable interface");
	}
}

public class MyThreadClass {

	public static void main(String[] args) {
		Threading r = new Threading();
		Thread t = new Thread(r);
		t.start();
	}

}
