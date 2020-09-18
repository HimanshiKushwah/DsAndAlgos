package oopsConcept;

public class MethodOverLoadingUsingStatic {
	
	public static void greet(String name) {
		System.out.println("Hello "+name);
	}
	
	public static void greet(String name, String greetings) {
		System.out.println("Hello "+name+" , "+greetings);
	}
	public static void main(String[] args) {
		greet("Amit");
		greet("Ankit", "Nice to meet you");

	}

}
