package programming;

import java.util.Scanner;

public class FinanceCalculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter principal amount : ");
		double principal = s.nextDouble();
		
		System.out.println("Enter rate of interest : ");
		double rate = s.nextDouble();
		
		System.out.println("Enter time : ");
		double time = s.nextDouble();
		
		System.out.println("Simple Interest is : "+calculateSimpleInterest(principal,rate,time));		
		

	}

	public static double calculateSimpleInterest(double principal, double rate, double time) {
		// TODO Auto-generated method stub
		return (principal*rate*time);
	}

}
