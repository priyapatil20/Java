package programming;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter a no for temp in Fahrenheit : ");
		double F = s.nextDouble();	
		
		System.out.println("Temperature from Fahrenheit to Celsius is : "+convertFahrenheitToCelsius(F));
		

		
	}

	private static double convertFahrenheitToCelsius(double F) {
		
		return ((F - 32) * 5/9);
	}

}
