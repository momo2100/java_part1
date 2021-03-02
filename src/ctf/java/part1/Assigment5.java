package ctf.java.part1;

public class Assigment5 {
	public static void main(String[] args) {
		System.out.println("Call method not return value ..");
		helloEveryOne();
		
		System.out.println("Call method return value ..");
		System.out.println(helloSomeOne("Somchai"));
	}
	
	public static void helloEveryOne() {
		System.out.println("Hello somebody ..");
	}
	
	public static String helloSomeOne(String name) {
		return "Hello "+name;
	}
}
