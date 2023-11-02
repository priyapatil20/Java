package programming;

import java.util.Scanner;

public class PowerOfSquares {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter a number: ");
		int num = s.nextInt();	
		
		System.out.println("Square of number is : "+SquareNumber(num));

	}

	private static int SquareNumber(int num) {
		// TODO Auto-generated method stub
		return (num*num);
	}		

	

}
