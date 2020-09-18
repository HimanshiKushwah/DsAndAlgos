package serializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	String s="Tuffy";
}
class Cat implements Serializable{
	String s="leila";
}
class Rat implements Serializable{
	String s="Stuart";
}
public class MultipleObjects  {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d1= new Dog();
		Cat c1= new Cat();
		Rat r1= new Rat();
		FileOutputStream fos= new FileOutputStream("animals.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);
		
		FileInputStream fis= new FileInputStream("animals.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Object o= ois.readObject();
		if(o instanceof Dog) {
			Dog d=(Dog)o;
			System.out.println(d.s);
		}
		if(o instanceof Cat) {
			Cat c=(Cat)o;
			System.out.println(c);
		}
		
		if(o instanceof Rat) {
			Rat r=(Rat)o;
			System.out.println(r);
		}
		
	}

}
