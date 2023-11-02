//create a method that takes speed and time and returns the distance travelled.



package programming;

import java.util.Scanner;

public class JourneyCalculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
        System.out.println("Enter speed: ");
		double speed = s.nextDouble();
		System.out.println("Enter time: ");
		double time = s.nextDouble();     
	    
	    System.out.println("distance travelled is :"+calculateDistance(speed,time));

	}
	
	public static double calculateDistance(double speed, double time) {
		
		return (speed*time);
		
	}

}
