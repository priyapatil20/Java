import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int m = s.nextInt();
		int n = s.nextInt();
		
		System.out.println("GCD of "+m+" and "+n+" is "+GCD.FindGCD(m,n));

	}

}
