package programming;

import java.util.Scanner;

public class AverageCalculation {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter a marks for sem1: ");
		int sem1 = s.nextInt();
		
		System.out.println("Enter a marks for sem2: ");
		int sem2 = s.nextInt();
		
		System.out.println("Enter a marks for sem3: ");
		int sem3 = s.nextInt();
		
		System.out.println("Enter a marks for sem4: ");
		int sem4 = s.nextInt();
		
		System.out.println("Enter a marks for sem5: ");
		int sem5 = s.nextInt();
		
		System.out.println("Enter a marks for sem6: ");
		int sem6 = s.nextInt();
		
		System.out.println("Enter a marks for sem7: ");
		int sem7 = s.nextInt();
		
		System.out.println("Enter a marks for sem8: ");
		int sem8 = s.nextInt();
		
		System.out.println("Average of all sem is : "+CalculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8));				

	}

	private static double CalculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7,
			int sem8) {
		// TODO Auto-generated method stub
		return (sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8 )/8;
	}

}
