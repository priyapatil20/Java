package programming;

import java.util.Scanner;

public class HalveIt {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter a number : ");
		double num = s.nextDouble();
		
		System.out.println("number after halving is : "+halveTheNumber(num));				

	}

	public static double halveTheNumber(double num) {
		// TODO Auto-generated method stub
		return (num /2);
	}

}
