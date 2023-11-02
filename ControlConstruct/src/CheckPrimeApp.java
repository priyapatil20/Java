import java.util.Scanner;

public class CheckPrimeApp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int num = s.nextInt();
		
		int res = CheckPrime.IsPrime(num);
		
		if(res == -1) {
			System.out.println(num+" is not prime no");
		}
		else {
			System.out.println(num+" is a prime no");
		}

	}

}
