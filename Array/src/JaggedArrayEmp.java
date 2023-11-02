import java.util.Scanner;

public class JaggedArrayEmp 
{

	public static void main(String[] args)
	{
//		Creating 3D Jagged Array
		Scanner s = new Scanner(System.in);
		
//		Enter no of branches
		System.out.println("Enter no of branches"); 
		String arr[][][] = new String [s.nextInt()][][];
		
//		Enter no of teams in each branches
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println("Enter no of teams in branch "+(i+1));
			arr[i] = new String[s.nextInt()][];
		}
		
		
//		Enter no of employees in each teams in each branches
		for(int i=0; i<arr.length; i++) 
		{
			{
				for(int j=0; j<arr[i].length; j++) 
				{ 
					System.out.println("Enter no of employees in team "+(j+1)+" of branch "+(i+1));
					arr[i][j] = new String[s.nextInt()];
				}
			}
		}
		
		
//		storing content in array
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++) 
				{
				  System.out.println("Enter Name of employee "+(k+1)+" in team "+(j+1)+" of branch "+(i+1));
				  arr[i][j][k] = s.next();
				}
			}
		}
		
		
//		Displaying content
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++) 
				{
					System.out.println("Name of employee "+(k+1)+" in team "+(j+1)+" of branch "+(i+1)+" is "+arr[i][j][k]);
				   
				}
			}
		}
     
	}

}
