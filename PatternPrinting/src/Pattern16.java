import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = s.next().charAt(0);
		System.out.println("Enter no of times you want to print "+ch+" : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1; j<=n+1-i; j++) {
			if( i==1 || j==1 || j==n+1-i ) {
				System.out.print(ch);
			}
			else {
				System.out.print(" ");
			}
		   }
			System.out.println();
			
			
		}
  }			
	
}
