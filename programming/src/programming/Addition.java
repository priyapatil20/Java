//. Your first task is to build a function that will be able to add two numbers in their number system.

//Function:

//public static long galacticAddition(long num1, long num2)


package programming;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first num: ");
		long num1 = s.nextLong();
		
		System.out.println("Enter second num: ");
		long num2 = s.nextLong();
		
		System.out.println("Addition of "+num1+"and"+num2+"is :"+AdditionNum(num1,num2));
		
	}
	
	public static long AdditionNum(long num1,long num2) {
		
		return (num1 + num2);
	}

}
