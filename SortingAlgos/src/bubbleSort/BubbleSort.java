package bubbleSort;

public class BubbleSort
{
//	Method to sort an array using bubbleSort algorithm
	public static int[] bubbleSort(int [] arr) 
	{
//		Traversing through entire array
		for(int i=0; i<=arr.length-2; i++) 
		{
//			traversing to all elements in each iteration
			for(int j=0; j<=arr.length-i-2; j++) 
			{
//				checking whether jth element is greater than next (j+1)th element
				if(arr[j] > arr[j+1]) 
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}	
			}
		}
//		returning sorted array
		return arr;
	}

}
