package binerySearch;

import java.util.Scanner;

public class BinerySearch 
{
	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		
//		taking size of an array from user
		System.out.println("Enter size of an array : ");
		int arr[] = new int[s.nextInt()];
		
		
//		entering elem in an array
		System.out.println("Enter "+arr.length+" elem in an array: ");
		for(int i=0; i<=arr.length-1; i++) 
		{
			arr[i] = s.nextInt();
		}
		
		
//		printing elem in an array
		System.out.println("Elem in an array are : ");
		for(int x :arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		
//      asking key elem from user
		System.out.println("Enter key elem to search : ");
		int key = s.nextInt();
		
		
//		searching for key elem
		int low=0;
		int high = arr.length-1;
		
//		searching for key until low<=high
		while(low<=high) 
		{	
			
//			calculating mid for every iteration
			int mid = (low + high)/2;
			
//			checking if key is present at mid index
			if(key==arr[mid]) 
			{
				System.out.println("key elem "+key+" is found at index "+mid);
				return;
				
			}
			
//			if key is not present checking whether key is greater than arr[mid
			else if(key>arr[mid]) 
			{
				low = mid+1;
//				high = high;
				
			}
			
//			if key is not present & key is not greater than arr[mid],
//			means it is lesser than arr[mid]
			else
			{
//				low=low;
				high=mid-1;
			}
			
		}	
		
//		   print key not found if key is not present in an array
		   System.out.println("Key elem "+key+" not found in given array");
		
	}


}
