import java.util.Scanner;

public class Pattern18 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of times you want to print a character : ");
		int n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1;j<=n; j++) {
				
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
}
