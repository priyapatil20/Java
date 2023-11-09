
// program to print Diagonal Elements in matrix

import java.util.Scanner;

public class DigonalElemMatrix {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter no of rows and columns");
		int rowcol = s.nextInt();
		
		
		//		array creation
		int [][]arr = new int[rowcol][rowcol];
		

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
		
		
		
		System.out.println("Diagonal Elements in matrix are");
		for(int i=0; i<=arr.length-1; i++) 
		{
			for(int j=0; j<=arr.length-1; j++) 
			{
				if(arr[i]==arr[j]) 
				{
				  System.out.print(arr[i][j]+" ");	
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
