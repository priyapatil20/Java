import java.util.Scanner;

public class DigitCountApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = s.nextInt();
		
		System.out.println("No of digits in "+num+" is "+DigitCount.CountDigit(num));
		

	}

}
