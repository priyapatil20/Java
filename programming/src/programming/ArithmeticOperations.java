package programming;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter first number: ");
		int num1 = s.nextInt();
		System.out.println("Enter second number: ");
	    int num2 = s.nextInt();
	    
	    System.out.println("Addition of two numbers is :"+Addition(num1, num2));
	    System.out.println("Subtraction of two numbers is :"+Subtraction(num1, num2));
	    System.out.println("Multiplication of two numbers is :"+Multiplication(num1, num2));
	    System.out.println("Division of two numbers is :"+Division(num1, num2));
	    System.out.println("Reminder of two numbers is :"+Reminder(num1, num2));
	}

	private static int Addition(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1 + num2) ;
	}

	private static int Subtraction(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1 - num2);
	}

	private static int Multiplication(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1 * num2);
	}

	private static double Division(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1 / num2);
	}

	private static int Reminder(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1 % num2);
	}

}
