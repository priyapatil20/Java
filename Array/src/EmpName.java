import java.util.Scanner;

public class EmpName {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		taking input from user
		System.out.println("Enter no of branches of a company : ");
		int branch = s.nextInt();
		
		for(int i=0;) {
		    int team = s.nextInt();
		
		System.out.println("Enter no of employees in teams : ");
		int emp = s.nextInt();
		
//		creating array
		int arr[][][] = new int[branch][team][emp];
		
		
//		storing content
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				for(int k=0; k<arr.length; k++) 
				{
					System.out.println("Enter name of employee "+(k+1)+" in team "+(j+1)+" of branch "+(i+1));
					arr[i][j][k] = s.nextInt();
				}
			}
		}
		
		
//		displaying content
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				for(int k=0; k<arr.length; k++) 
				{
					System.out.println(arr[i][j][k]);
				}
			}
		}
		

	}

}
