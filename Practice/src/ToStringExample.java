import java.lang.Object;
class Student1 {
	String name;
	int rollno;

	Student1(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	public boolean equals(Object obj) {
		try {
			String name1=this.name;
			int rollno=this.rollno;
			Student1 s=(Student1)obj;
			String name2=s.name;
			int rollno1=s.rollno;
			if(name1.equals(name2)&& rollno==rollno1) {
				return true;
			}
			else 
				return false;
		}catch(ClassCastException e) {
			return false;
		}
	}
	public static void main(String[] args) {
		Student1 s1 = new Student1("durga", 101);
		Student1 s2 = new Student1("durga", 101);
		Student1 s3 = new Student1("ravi", 102);
		Student1 s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s4.equals(s1));
		System.out.println(s1.equals("durga"));
	}
}

public class ToStringExample {

	public static void main(String[] args) {

	}

}
