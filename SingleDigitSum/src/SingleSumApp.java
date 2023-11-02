import java.util.Scanner;

public class SingleSumApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = s.nextInt();

		System.out.println("sum of the digits of a number "+n+" until the sum becomes a single digit is : "+SingleSum.FindingSingleSum(n));
	}

}
