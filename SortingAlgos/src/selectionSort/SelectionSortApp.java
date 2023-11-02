package selectionSort;

import java.util.Scanner;

public class SelectionSortApp 
{

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		
//		Array Creation
		int arr[] = new int[s.nextInt()];
		
		
//		storing elements in an array
		System.out.println("Enter "+arr.length+" elements in an array : ");
		for(int i=0; i<=arr.length-1; i++) 
		{
			arr[i] = s.nextInt();
		}

		
//		displaying elements in an array before sorting
		System.out.println("Before sorting Elements in an array are : ");
		for(int x:arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		
//		calling Selecion sort method
		int[] SortedArray =  SelectionSort.SelectionSorting(arr);
		
//		displaying elem in an array after sorting
		System.out.println("After sorting Elements in an array are : ");
		for(int x:SortedArray) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
	}

}
