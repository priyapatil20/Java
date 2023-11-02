import java.util.Scanner;

public class NaturalNoApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first no :");
		int a = s.nextInt();
		System.out.println("Enter second no :");
		int b = s.nextInt();
		
		if(a!=0 && a>0 && a<=b) {
		System.out.println("Natural Nos between "+a+" and "+b+" are ");
		NaturalNo.Natural(a,b);
		}
		else {
			System.out.println("Enter valid no");
		}

	}

}
