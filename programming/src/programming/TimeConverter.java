package programming;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter minute value : ");
		int minutes = s.nextInt();
		
		System.out.println("conversion of minute to hour is : "+convertToHours(minutes));		


	}

	public static double convertToHours(int minutes) {
		// TODO Auto-generated method stub
		return (minutes/60);
	}

}
