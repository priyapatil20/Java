import java.util.Scanner;

public class Arrow {
	
	public static void main(String [] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n number : ");
		int n = s.nextInt();
		
		for(int i=0; i<=n-1; i++) 
		{
			
			for(int j=0; j<=n-1; j++) 
			{
				
				if(i==0 || j==n-1 || i==j || (i+j==n-1 && i>=n/2)) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
