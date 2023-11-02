
//  java program to find sum of all elements in an array

package ArrayProg;

import java.util.Scanner;

public class SumAll {

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
		

//		for finding sum of all elements in an array
		System.out.println("sum of elements in an array is :");
		int sum = 0;
		for(int i=0; i<arr.length; i++) 
		{
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}

}
