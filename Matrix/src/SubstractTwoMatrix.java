

//program to print addition of two matrix

import java.util.Scanner;

public class SubstractTwoMatrix 
{
	
	public static void main(String[] args) 
	{

		Scanner s = new Scanner(System.in);

		System.out.println("Enter no of rows");
		int row = s.nextInt();
		System.out.println("Enter no of columns");
		int col = s.nextInt();
		

		//		array creation
		int [][]arr1 = new int[row][col];
		int [][]arr2 = new int[row][col];
        int [][]arr3 = new int[row][col];
		
		
//		       storing elem in matrix	
		System.out.println("Enter elem in matrix 1");
		for(int i=0; i<row; i++) 
		{
			for(int j=0; j<col; j++) 
			{
				arr1[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Enter elem in matrix 2");
		for(int i=0; i<row; i++) 
		{
			for(int j=0; j<col; j++) 
			{
				arr2[i][j] = s.nextInt();
			}
		}
		
		


//		      displaying elem in matrix
		System.out.println("Elem in matrix 1 are");
		for(int i=0; i<row; i++) 
		{
			for(int j=0; j<col; j++) 
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		

		System.out.println("Elem in matrix 2 are");
		for(int i=0; i<row; i++) 
		{
			for(int j=0; j<col; j++) 
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		
//		Substraction of two matrix
		for(int i=0; i<row; i++) 
		{
			for(int j=0; j<col; j++) 
			{
				arr3[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		
		
//		Displaying sum of two matrix
		System.out.println("Substraction of two matrixes is ");
		for(int i=0; i<row; i++) 
		{
			for(int j=0; j<col; j++) 
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}	


	}

}
