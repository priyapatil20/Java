import java.util.Scanner;

public class RegularArrayEmp {

	public static void main(String[] args) {
		
//		Creating 3D Regular array
		Scanner s = new Scanner(System.in);
		
//        Enter no of branches , no of teams, no of employees
		System.out.println("Enter no of branches, no of teams, no of employees : ");
		String arr [][][] = new String[s.nextInt()][s.nextInt()][s.nextInt()];
		
		
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
