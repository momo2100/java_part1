package ctf.java.part1;

public class Assigment2_2 {
	public static void main(String[] args) {
		//1.
		bark();
		//2.
		float myFloat = 5.5f;
		int myInt = 10;
		double myDouble = 24876958d;
		char myChar ='a';
		System.out.println("float->int " +(int)myFloat);
		System.out.println("int->float " +(float)myInt);
		System.out.println("double->float " +(float)myDouble);
		System.out.println("char->int " +(int)myChar);
		//3.
		final String hello ="Hello";
		//hello = "World"; -- can't run compile error 
	}
	
	public static void bark() {
		String dogName = "Mochi";
		System.out.println("The Dog name = "+dogName+" bark");
	}
}
