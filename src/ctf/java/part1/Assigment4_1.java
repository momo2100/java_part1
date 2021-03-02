package ctf.java.part1;

public class Assigment4_1 {
	public static void main(String[] args) {
		
		//1.
				int score = 79;
				if(score >= 80)
					System.out.println("Good");
				else if (score >= 50)
					System.out.println("normal");
				else 
					System.out.println("fail");
				
				//2.
				boolean isHandSome = true;
				if(score >= 80 || isHandSome)
					System.out.println("Good");
				else if (score >= 50)
					System.out.println("normal");
				else 
					System.out.println("fail");
	}
}
