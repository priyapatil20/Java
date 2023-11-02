
//Day 47  program to create an array by merging two arrays

package ArrayProg;

import java.util.Scanner;

public class MergingTwoArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//      taking size of array1 from user & creating array
		System.out.println("enter num of elemnts in an array1 :");
		int arr1[] = new int[s.nextInt()];
				
//		storing elem in array1
		System.out.println("enter elem present in an array1 : ");
		for(int i=0; i<arr1.length; i++) 
		{
			arr1[i] = s.nextInt();
		}
		
		
		
		
//		taking size of array2 from user & creating array
		System.out.println("enter num of elemnts in an array2 :");
		int arr2[] = new int[s.nextInt()];
		
//		storing elem in array2
		System.out.println("enter elem present in an array2 : ");
		for(int i=0; i<arr2.length; i++) 
		{
			arr2[i] = s.nextInt();
		}
		
		
		
		
		
//		creating array3 by merging lenghts of array1 and array2
		int arr3[] = new int [(arr1.length + arr2.length)];
		
				
//		copying elem of arr1 into arr3
		for(int i=0; i<arr1.length; i++) 
		{
			arr3[i] = arr1[i];
		}
		
//		copying elem of arr2 into arr3
		int j=0;
		for(int i=arr1.length; i<arr3.length; i++) 
		{
			arr3[i] = arr2[j];
			j++;
		}
		
		
		System.out.println("First array elements are : ");
		for(int x : arr1) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Second array elements are : ");
		for(int x : arr2) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Third array elements after merging arr1 & arr2 are : ");
		for(int x : arr3) 
		{
			System.out.print(x+" ");
		}
		
	}
}
