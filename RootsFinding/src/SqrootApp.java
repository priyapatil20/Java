import java.util.Scanner;

public class SqrootApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = s.nextInt();
//		System.out.println("Enter second number :");
//		int num2 = s.nextInt();
		
		System.out.println("Square root of "+num+" is : "+Sqroot.FindSqroot(num));
		

	}

}
