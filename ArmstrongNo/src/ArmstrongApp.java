import java.util.Scanner;

public class ArmstrongApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = s.nextInt();

		if(Armstrong.IsArmstrong(num)) {
			System.out.println(num+" is a Armstrong no");
		}
		else {
			System.out.println(num+" is not a Armstrong no");
		}

	}

}
