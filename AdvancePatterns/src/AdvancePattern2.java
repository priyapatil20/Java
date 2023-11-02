import java.util.Scanner;

public class AdvancePattern2 
{

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n = s.nextInt();
		
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(  i==0      ||   j==0      ||   i==n-1      ||   j==n-1      ||     i==j        ||    i+j==n-1      ||   i==n/2         ||     j==n/2       ||     i+j==n/2    ||    j-i==n/2   ||    i-j==n/2    ||   i+j==(3*n-2)/2)
//				    Top(-)         Left (| )       Bottom (-)       Right ( |)       Big Left (\)       Big Right (/)      Horizontal (-)       Vertical (|)          Upper (/)          Upper (\)        Lower (\)         Lower (/)
//				   Boundry         Boundry         Boundry          Boundry          Diagonal           Diagonal         Central Diagonal    Central Diagonal        Diagonal_1         Diagonal_2      Diagonal_1        Diagonal_2
//				                                                                                                                                                                                                         i+j = 15 = 10  + 5
//                                                                                                                                                                                                                                 (n-1)+ n/2 = ((2n-2)+n))/2
//					                                                                                                                                                                                                                                (3n-2)/2
					
					
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
