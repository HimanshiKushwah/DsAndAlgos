//Method signature 
//public String toString(){
//return getClass().getName()+"@"+Integer.toHexString(hashCode());
// }
 class Student{
	String name;
	int rollno;
	Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public String toString() {//My own toString method
		return(name+"---"+rollno);
	}
	public static void main(String[] args) {
		Student s= new Student("Himanshi",101);
		Student s1= new Student("Ankit",102);
		Integer i=new Integer(10);//Wrapper classes
		java.util.ArrayList l= new java.util.ArrayList();
		l.add("A");
		l.add(10);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(i);
		System.out.println(l);
		
	}
	
}
public class ToStringMethodExample {

	public static void main(String[] args) {
		ToStringMethodExample t= new ToStringMethodExample();

	}

}
