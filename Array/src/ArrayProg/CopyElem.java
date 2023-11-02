// Program to copy elements of one array into other

package ArrayProg;

import java.util.Scanner;

public class CopyElem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter no of elements in array1 : ");
//		creating an array
		int arr1[] = new int[(s.nextInt())];
		
//		storing elements in array1
		for(int i=0; i<arr1.length; i++) 
		{
			System.out.println("Enter Element "+(i+1)+" in array1 : ");
			arr1[i] = s.nextInt();
		}
		
//		displaying elements in array1
		System.out.print("Elemets in array1 are : ");
		for(int i=0; i<arr1.length; i++) 
		{
			System.out.print(+arr1[i]+"  ");
			
		}
		System.out.println();
		
//		creating array2
		int arr2[] = new int[arr1.length];
		
		
//		copying elements of array1 into array2
		for(int i=0; i<arr1.length; i++) 
		{
			arr2[i] = arr1[i];
		}

//		displaying elements in array2
		System.out.print("Copied Elemets in array2 are : ");
		for(int i=0; i<arr1.length; i++) 
		{
			System.out.print(arr2[i]+"  ");
			
		}
	}

}
