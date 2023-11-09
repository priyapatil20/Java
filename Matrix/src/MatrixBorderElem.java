
// program to print only border elements in the matrix


import java.util.Scanner;

public class MatrixBorderElem {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);

		System.out.println("Enter no of rows");
		int rows = s.nextInt();
		System.out.println("Enter no of columns");
		int cols = s.nextInt();

		//		array creation
		int [][]arr = new int[rows][cols];

		System.out.println("Enter elem in an array");
		
		//		storing elem in an array
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				arr[i][j] = s.nextInt();
			}
		}

		System.out.println("Elem in an array are");
		
		//  displaying elem in an array
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				if(i==0 || j==0 || i==arr.length-1 || j==arr[i].length-1) 
				{
					System.out.print(arr[i][j]+" ");
				}
				else 
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

}
