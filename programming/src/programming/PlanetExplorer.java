package programming;

import java.util.Scanner;

public class PlanetExplorer {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter radius : ");
		double radius = s.nextDouble();
		
		System.out.println("Surface area of a sphere is : "+calculateSurfaceArea(radius));

	}

	public static double calculateSurfaceArea(double radius) {
		// TODO Auto-generated method stub
		return (4*3.14*radius*radius);
	}

}
