import java.util.Scanner;

public class SumOfSquaresApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num= s.nextInt();

		System.out.println("Sum of Squares of first "+num+" numbers is "+SumOfSquares.SqSum(num));
	}

}
