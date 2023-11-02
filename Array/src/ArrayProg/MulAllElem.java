// program to multiply all elements in an array

package ArrayProg;

import java.util.Scanner;

public class MulAllElem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter no of elements in an array : ");
//		creating array
		int arr[] = new int[(s.nextInt())];
		
//		storing elements in array
		for(int i=0; i<arr.length; i++) 
		{
			System.out.print("Enter Elements in arr : ");
			arr[i] = s.nextInt();
		}
		

//		for finding multiplication of all elements in an array
		System.out.println("multiplication of elements in an array is :");
		int mul = 1;
		
//	       Traditional for loop
//		for(int i=0; i<arr.length; i++) 
//		{
//			mul = mul * arr[i];
//		}
		
//		   Advance for loop => used when we have to print all elements of array, and elements without index
		for(int i : arr) 
		{
			mul = mul * i;
		}
		System.out.println(mul);
	}
}
