import java.util.Scanner;

public class AgeCalculationApp {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a no :");
		int age = s.nextInt();
		
		AgeCalculation.CalculateAge(age);
		

	}

}
