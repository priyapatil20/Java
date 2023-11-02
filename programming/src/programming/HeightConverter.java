package programming;

import java.util.Scanner;

public class HeightConverter {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter inch value : ");
		double inches = s.nextDouble();
		
		System.out.println("conversion factor from inches to feet is : "+convertInchesToFeet(inches));		

	}

	public static double convertInchesToFeet(double inches) {
		// TODO Auto-generated method stub
		return (inches/12);
	}

}
