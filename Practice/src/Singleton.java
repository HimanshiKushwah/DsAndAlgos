
public class Singleton {
	
	private static Singleton s=new Singleton();
	private Singleton() {
		
	}
	public static Singleton getSingleton() {
		
		return s;
	}
	public static void main(String[] args) {
		
		Singleton t1= Singleton.getSingleton();
		
	}

}
