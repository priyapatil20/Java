package programming;

import java.util.Scanner;

public class ThrustCalculation {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter a number : ");
		int num = s.nextInt();
		
		System.out.println("result after raising the throttleSetting to the fifth power is : "+calculateThrust(num));						

	}

	public static int calculateThrust(int num) {
		// TODO Auto-generated method stub
		return (int) Math.pow(num , 5);
	}

}
