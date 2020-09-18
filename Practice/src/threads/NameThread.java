package threads;

class Ankit extends Thread{
	public void run() {
		
		System.out.println("run method executed by: "+Thread.currentThread().getName());
	}
}
public class NameThread {

	public static void main(String[] args) {
		Ankit t = new Ankit();
		t.start();
		System.out.println("Main thread executed by: "+Thread.currentThread().getName());
	}

}
