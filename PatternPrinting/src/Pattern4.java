import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a character : ");
			char ch = s.next().charAt(0);
			System.out.println("Enter no of times you want to print "+ch+" : ");
			int n = s.nextInt();
			
			for(int i=1;i<=n;i++) {
				
				for(int j=1;j<=i;j++) {
					System.out.print(ch);
				}
				System.out.println();
			}

	}

}
