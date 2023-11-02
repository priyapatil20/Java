import java.util.Scanner;

public class CheckingCapitalApp {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a character :");
		char ch = s.next().charAt(0);
		
		CheckingCapital.CapitalChecking(ch);
		
	}

}
