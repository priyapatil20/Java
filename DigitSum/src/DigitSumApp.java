import java.util.Scanner;

public class DigitSumApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no :");
		int n = s.nextInt();
		
		System.out.println("Sum of "+n+" is : "+DigitSum.FindDigitSum(n));


	}

}
