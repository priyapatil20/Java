package insertionSort;

import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		
//		array creation
		int arr[] = new int[s.nextInt()];
		
//		enter elem in an array
		System.out.println("Enter "+arr.length+" elem in an array");
		for(int i=0; i<arr.length; i++) 
		{
			arr[i] = s.nextInt();
		}
		

		System.out.println("Elemements in an array before sorting are ");
//		display elem in an array
		for(int x:arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		int SortedArr[] = InsertionSort.InsertionSorting(arr);
		
		
		System.out.println("Elemements in an array after sorting are ");
//		printing sorted array
		for(int x : SortedArr) 
		{
			System.out.print(x+" ");
		}

	}

}
