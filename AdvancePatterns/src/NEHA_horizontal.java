import java.util.Scanner;

public class NEHA_horizontal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = s.nextInt();

		for(int i=0; i<=n-1; i++)
		{

			//N
			for(int j=0; j<=n-1; j++) 
			{
				if(j==0 || j==n-1 || i==j)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}	


			System.out.print("   ");



			//E
			for(int j=0; j<=n-1; j++) 
			{
				if(i==0 || j==0 || i==n-1 || i==n/2) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}


			System.out.print("   ");



			//H			
			for(int j=0; j<=n-1; j++) 
			{	
				if( j==0 ||j==n-1 || i==n/2) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}	


			System.out.print("   ");



			//A
			for(int j=0; j<=n-1; j++) 
			{
				if(i==0 || j==0 || j==n-1 || i==n/2)
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
