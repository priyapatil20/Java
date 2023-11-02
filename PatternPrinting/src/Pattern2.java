import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = s.next().charAt(0);
		System.out.println("Enter no of times you want to print "+ch+" : ");
		int n = s.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println(ch);
		}
	}

}
