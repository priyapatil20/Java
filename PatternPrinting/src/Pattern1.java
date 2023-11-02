import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = s.next().charAt(0);
		System.out.println("Enter no of times you want to print "+ch+" : ");
		int num = s.nextInt();


		for(int i=0;i<=num;i++) {
			System.out.print(ch);
		}


	}

}
