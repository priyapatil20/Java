
//Regular Array := when no of columns are same in every row
// Jagged Array := when no of columns are different in every row

import java.util.Scanner;

public class JaggedArrayStud 
{

	public static void main(String[] args) 
	{

		Scanner s = new Scanner(System.in);

		//		asking no of classes , no of students in each class
		System.out.println("Enter no of classes :");
		
		float[][] arr = new float[s.nextInt()][];

		
//				creating an array
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter no of students in class "+(i+1));
			arr[i] = new float[s.nextInt()];
		}

		//      storing content in an array
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				System.out.println("Enter % of student "+(j+1)+" of class "+(i+1));
				arr[i][j] = s.nextFloat();
			}
		}

		//      displaying an array
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				System.out.println("% of student "+(j+1)+" of class "+(i+1)+" is : "+arr[i][j]);
			}
		}

	}


}
