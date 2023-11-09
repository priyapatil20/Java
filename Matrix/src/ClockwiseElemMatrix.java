
// program to print elements of array in clockwise direction


import java.util.Scanner;

public class ClockwiseElemMatrix 
{

	public static void main(String[] args) 
	{

		Scanner s = new Scanner(System.in);

		System.out.println("Enter no of rows");
		int rows = s.nextInt();
		System.out.println("Enter no of columns");
		int cols = s.nextInt();
		

		//		array creation
		int [][]arr = new int[rows][cols];
		
		
		

		System.out.println("Enter elem in matrix");
		//		storing elem in an array
		for(int i=0; i<=arr.length-1; i++) 
		{
			for(int j=0; j<=arr[i].length-1; j++) 
			{
				arr[i][j] = s.nextInt();
			}
		}

		
		
		System.out.println("Elem in matrix are");
		//  displaying elem in an array
		for(int i=0; i<=arr.length-1; i++) 
		{
			for(int j=0; j<=arr[i].length-1; j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		System.out.println("Elements in matrix in clockwise order are");
		
		
		
//		for 1st row  ->
		for(int i=0; i<=cols-1; i++) 
		{
			System.out.print(arr[0][i]+" ");
		}
		
		
//		for last column  |
		for(int i=1; i<=rows-1; i++) 
		{
			System.out.print(arr[i][cols-1]+" ");
		}
		
		
//		for last row  <-
		for(int i=cols-2; i>=0; i--) 
		{
			System.out.print(arr[rows-1][i]+" ");
		}
		
		
		
//		for 1st column  ^|
		for(int i=rows-2; i>=1; i--) 
		{
			System.out.print(arr[i][0]+" ");
		}
		
       System.out.println();
	}

}
