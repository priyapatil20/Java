import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no :");
		int n = s.nextInt();
		
		System.out.println("Factorial of "+n+" is : "+Factorial.FindFactorial(n));

	}

}
