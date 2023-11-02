

// java program to create arr3 by adding elem from arr1& arr2

package ArrayProg;

import java.util.Scanner;

public class TwoArrayAddition {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter size of array :");
		int arr1[] = new int[(s.nextInt())];
		int arr2[] = new int[arr1.length];
		int arr3[] = new int[arr1.length];

		
		
		System.out.println("enter elem in arr1 :");
		for(int i=0; i<arr1.length; i++) 
		{
			arr1[i] = s.nextInt();
		}
		
		System.out.println("enter elem in arr2 :");
		for(int i=0; i<arr2.length; i++) 
		{
			arr2[i] = s.nextInt();
		}
		
	
		
		
//	    adding elements of arr1 & arr2 to make arr3
		for(int i=0; i<arr1.length;i++) 
		{
			arr3[i] = arr1[i] + arr2[i];
		}
		
		
		
		System.out.println("Elements in arr1 are : ");
		for(int x:arr1) 
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		
		System.out.println("Elements in arr2 are : ");
		for(int x:arr2) 
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		
		System.out.println("Elements in arr3 are : ");
		for(int x:arr3) 
		{
			System.out.print(x+" ");
		}
	}

}
