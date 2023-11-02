package programming;

import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
		
        System.out.println("Enter a number: ");
		int num = s.nextInt();
		
		System.out.println("Double of "+num+" is "+(num*2));

	}

}