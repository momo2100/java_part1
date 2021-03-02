package ctf.java.part1;
import java.io.*;  

public class Assigment4_4 {
	public static void main(String[] args) {
		//Lab 6 While loop
		//1.
		int i =0;
		while (i <=10)
		{
			System.out.println("i = " + i);
			i++;
		}
		
		//2.
		i =0;
		int sum = 0;
		while (i <=10)
		{
			sum = sum+ i;
			i++;
		}
		System.out.println("sum = " + sum);
		
		//3.
		i =1;
		while (i <=100)
		{
			if(i%12 ==0) 
				System.out.println(i + " is divisible by 12");
			i++;
		}
		//4.
		int myArray[] = {1,2,3,4,5};
		for(int myInt : myArray) {
		System.out.println("myArray :" + myInt);
		}
		// Lab 7.
		//1.
		i = 20;
		do {
			System.out.println(i);
			i--;
		} while(i>0);
		//2.
		
		String inpString = "";
		Console con = System.console();   
		 do {
			 inpString = con.readLine("Enter number [odd is quit] : "); 
		 } while(Integer.parseInt(inpString) %2 != 0);
		 
		// Lab 8.
		//1.
		 for (int count = 1; count <= 20; count++ ) {
			 if ( count == 11 ) {
				 System.out.println("Count : " + count );
				 break;
			 }
		 }
		 
	}
}
