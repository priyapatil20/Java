package programming;

import java.util.Scanner;

public class CubeMystry {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter a number: ");
		int num = s.nextInt();	
		
		System.out.println("Cube of number is : "+CubeNumber(num));

	}

	private static int CubeNumber(int num) {
		// TODO Auto-generated method stub
		return (num*num*num);
	}

}
