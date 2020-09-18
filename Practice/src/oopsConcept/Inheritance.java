package oopsConcept;


class Animal{
	String voice;
	boolean vegetarian;
	int legs;
	
	public Animal(String voice,boolean vegetarian,int legs) {
		
		this.voice=voice;
		this.legs= legs;
		this.vegetarian=vegetarian;
	}
	
	public boolean isVegetarian() {
		return vegetarian;
	}
}

class Cats extends Animal{
	private String colour;
	public Cats( String voice, boolean vegetarian, int legs) {
		super( voice, vegetarian, legs);
		this.colour="White";
	}
	
	public Cats(String voice, boolean vegetarian, int legs ,String colour) {
		super( voice, vegetarian, legs);
		this.colour=colour;
	}
	public String getColour() {
		return colour;
	}
	public void setColour() {
		this.colour=colour;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Cats c = new Cats("meow",false,4);
		System.out.println(c.voice);
		System.out.println(c.legs);
		System.out.println(c.vegetarian);
		System.out.println(c.getColour());

	}

}
