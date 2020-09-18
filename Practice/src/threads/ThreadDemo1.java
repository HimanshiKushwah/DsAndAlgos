package threads;

class Threads extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Its a child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		Threads t1 = new Threads();
		t1.start();

		for(int i=0;i<10;i++) {
			System.out.println("Its a Main thread");
		}

	}

}
