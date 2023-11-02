import java.util.Scanner;

public class Mdimensional 
{

	public static void main(String[] args) 
	{

		Scanner s = new Scanner(System.in);
		
		//    asking no of companies and employees
//		System.out.println("Enter number of companies :");
//		int companies = s.nextInt();
//		System.out.println("Enter number of each employees in a company :");
//		int employees = s.nextInt();
		
		System.out.println("Enter no of companies and employees :");
		
		
		//      creating an array
//		String arr[][] = new String[companies][employees];
		String arr[][] = new String[s.nextInt()][s.nextInt()];

		//      storing content in an array
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				System.out.println("Enter Name of company "+(i+1)+" employee "+(j+1));
				arr[i][j] = s.next();
			}
		}

		//      displaying an array
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				System.out.println("Name of company "+(i+1)+" employee "+(j+1));
			}
		}

	}
}
