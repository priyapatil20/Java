import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = s.next().charAt(0);
		System.out.println("Enter no of times you want to print "+ch+" : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=10-2*i-1;k++) {
				System.out.print(ch);
			}
			System.out.println();
			
			
		}
  }		
}
// for 1 3 5 7 9 => j <= 2*i-1     (Ascending)
// for 9 7 5 3 1 => j <= 10-2*i-1  (Descending)
// for 1 2 3 4 5 => j <= i
// for 5 4 3 2 1 => j <= 6-i => n+1-i



