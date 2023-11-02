
//sorting elem of an array
// there are two ways  to sort elem of an array
// 1. Using inbuilt Arrays.sort() method
// 2. By using sorting algorithm

// Any method which appears in italic in eclipse means
// it is a static method . so, sort in Arrays.sort() is a static method
// we are calling it directly using class Array as Array is in capital it shows it is a class

import java.util.Arrays;
//import java.util.Scanner;

public class SortingArrayInbuilt 
{

	public static void main(String[] args) 
	{
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter size of an array ");
//		int arr[] = new int[s.nextInt()];
		
//		System.out.println("Enter "+arr.length+" elem in an array ");
//		for(int i=0; i<=arr.length-1; i++) 
//		{
//			arr[i] = s.nextInt();
//		}
		
		
		int arr[] = {84,63,98,54,32}; 
		
		System.out.println("Array elements are : ");
		for(int x : arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		
//		For sorting array elem
		Arrays.sort(arr);
		
		System.out.println("Array Elements after sorting is : ");
		for(int x : arr) 
		{
			System.out.print(x+" ");
		}
      
	}

}
