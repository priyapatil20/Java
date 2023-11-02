import java.util.Scanner;

public class StudProjJagged
{

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);

//		enter no of classes
		System.out.println("Enter no of classes : ");
		String arr[][] = new String[s.nextInt()][];
		
//		enter no of students in each class
		for(int i=0; i<arr.length; i++) 
		{
		         System.out.println("Enter no of students in class "+(i+1));
		         arr[i] = new String[s.nextInt()];
		
		}   
		
		
//		storing content in array
		for(int i=0; i<arr.length;i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				System.out.println("Enter whether student "+(j+1)+" of class "+(i+1)+" has completed project ?");
				boolean status = s.nextBoolean();
				
//				checking whether student has entered true 
//				if true entered then store yes
				
				if(status == true) 
				{
					arr[i][j] = "Yes";
				}
				else 
				{
					arr[i][j] = "No";
				}
 			}
		}
		
		
//		displaying content of array
		System.out.println("Project completion status is :");
		for(int i=0; i<arr.length;i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		   
	}

}
