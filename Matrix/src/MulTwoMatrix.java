import java.util.Scanner;

//program to print multiplication of two matrix

public class MulTwoMatrix 
{
	
	public static void main(String[] args) 
	{

		Scanner s = new Scanner(System.in);

		System.out.println("Enter no of rows for matrix 1");
		int row1 = s.nextInt();
		System.out.println("Enter no of columns for matrix 1");
		int col1 = s.nextInt();
		
		System.out.println("Enter no of rows for matrix 2");
		int row2 = s.nextInt();
		System.out.println("Enter no of columns for matrix 2");
		int col2 = s.nextInt();
		

		//		array creation
		int [][]matrix1 = new int[row1][col1];
		int [][]matrix2 = new int[row2][col2];
        int [][]matrix3 = new int[row1][col2];
		
		
//		       storing elem in matrix	
		System.out.println("Enter elem in matrix 1");
		for(int i=0; i<row1; i++) 
		{
			for(int j=0; j<col1; j++) 
			{
				matrix1[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Enter elem in matrix 2");
		for(int i=0; i<row2; i++) 
		{
			for(int j=0; j<col2; j++) 
			{
				matrix2[i][j] = s.nextInt();
			}
		}
		
		


//		      displaying elem in matrix
		System.out.println("Elem in matrix 1 are");
		for(int i=0; i<row1; i++) 
		{
			for(int j=0; j<col1; j++) 
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		

		System.out.println("Elem in matrix 2 are");
		for(int i=0; i<row2; i++) 
		{
			for(int j=0; j<col2; j++) 
			{
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
		
//		Multiplication of two matrix
		for(int i=0; i<row1; i++) 
		{
			for(int j=0; j<col2; j++) 
			{
				for (int k = 0; k < col1; k++)
				{
					matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
				} 
			}
		}
		
		
//		Displaying sum of two matrix
		System.out.println("Multiplication of two matrixes is ");
		for(int i=0; i<row1; i++) 
		{
			for(int j=0; j<col2; j++) 
			{
				System.out.print(matrix3[i][j]+" ");  
			}
			System.out.println();
		}	


	}
}
