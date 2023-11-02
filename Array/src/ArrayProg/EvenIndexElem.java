
// program to print even index elem in an array


package ArrayProg;

import java.util.Scanner;

public class EvenIndexElem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//      taking size of array from user & creating array
		System.out.println("enter num of elemnts in an array :");
		
		int arr[] = new int[s.nextInt()];
		
//		storing elem in array
		System.out.println("enter elem present in an array : ");
		for(int i=0; i<arr.length; i++) 
		{
			arr[i] = s.nextInt();
		}
		
		
//		printing  elemnets in array
		System.out.println("elements present in an array are : "); 
		for(int i=0; i<arr.length; i++) 
		{
				System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
//		printing even index elemnets in array
		System.out.println("elements present at even index in an array are : "); 
		for(int i=0; i<arr.length; i++) 
		{
			if(i%2==0) 
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
