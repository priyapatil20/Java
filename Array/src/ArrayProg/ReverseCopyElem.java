
// Reverse order Coping Elemets from array1 to array2


package ArrayProg;

import java.util.Scanner;

public class ReverseCopyElem 
{
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
		int j = arr2.length-1;
		
//		copying elements of array1 into array2
		for(int i=0; i<arr1.length; i++) 
		{
			arr2[j] = arr1[i];
			j--;
		}

//		displaying elements in array2
		System.out.print("Reverse order Copied Elemets in array2 are : ");
		for(int i=0; i<arr1.length; i++) 
		{
			System.out.print(arr2[i]+"  ");
			
		}
	}
}
