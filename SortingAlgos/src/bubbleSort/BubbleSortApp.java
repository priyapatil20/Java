package bubbleSort;

import java.util.Scanner;

public class BubbleSortApp 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter size of an array : ");
//		array creation
		int arr[] = new int[s.nextInt()];
		
		
//		storing elem in an array
		System.out.println("Enter "+arr.length+" elem in an array : ");
		for(int i=0; i<=arr.length-1; i++) 
		{
			arr[i] = s.nextInt();
		}
		
	
//		print elem in an array before sorting
		System.out.println("Elem in an array before sorting are : ");
		for(int x : arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		
		
//		calling bubbleSort method for sorting an array
		int[] sortedArray = BubbleSort.bubbleSort(arr);
		
//		print elem in an array after sorting
		System.out.println("Elem in an array after sorting are : ");
		for(int x : sortedArray) 
		{
			System.out.print(x+" ");
		}
		
		
	}

}
