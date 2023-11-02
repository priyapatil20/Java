import java.util.Scanner;

public class EvenNoApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first no :");
		int a = s.nextInt();
		System.out.println("Enter second no :");
		int b = s.nextInt();
		
		if(a <= b) {
		  System.out.print("Even no between "+a+" and "+b+" are ");
		   EvenNo.Even(a, b);
		}
	  
	}

}
