import java.util.Scanner;

public class Algos 
{


	//	checking if array is soretd
	public static boolean CheckSort(int arr[])
	{
		for(int i=0; i<=arr.length-2; i++) 
		{
			if(arr[i] > arr[i+1]) 
			{
				System.out.println("Given Array is not sorted");
				return false;
			}
		}
		System.out.println("Given Array is sorted");
		return true;
	}



	//	performing linear search
	public static void LinearSearch(int arr[]) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter key element to search");
		int key = s.nextInt();

		for(int i=0; i<=arr.length-1; i++) 
		{
			if(key == arr[i]) 
			{
				System.out.println("After linear Searching, Key found at index "+i);
				return;
			}
		}
		System.out.println("After linear Searching, Key not found");
	}



	//	performing binary search
	public static void BinarySearch(int arr[]) 
	{
		Scanner s = new Scanner(System.in);

		//		Checking whether given array is sorted 
		boolean IsSorted = CheckSort(arr);

		if(IsSorted == true) 
		{
			System.out.println("Enter element to search");
			int elem = s.nextInt();

			int low = 0;
			int high = arr.length-1;


			while(low <= high) 
			{
				int mid = (high + low)/2;

				if(elem == arr[mid]) 
				{
					System.out.println("After Binary Searching, Element "+elem+" is fount at index "+mid);
					return;
				}
				else if(elem > arr[mid]) 
				{
					low = mid+1;
				}
				else 
				{
					high = mid -1;
				}
			}

			System.out.println("After Binary Searching, Element "+elem+" is not fount in given array");
		}
		else 
		{ 
			System.out.println("Enter 1: To perform Bubble Sort \nEnter 2: To perform Insertion Sort  \nEnter 3 : To perform Selection Sort");
			int choice = s.nextInt();

			switch(choice) 
			{
			case 1 : BubbleSort(arr);
			break;

			case 2 : InsertionSort(arr);
			break;

			case 3 : SelectionSort(arr);
			break;
			}

			BinarySearch(arr);
		}
	}





	//	Bubble Sort
	public static void BubbleSort(int arr[]) 
	{
		for(int i=0; i<=arr.length-1; i++) 
		{
			for(int j=0; j<=arr.length-2; j++) 
			{
				if(arr[j] > arr[j+1]) 
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Array After Bubble sorting is :");
		for(int x: arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}




	//	Insertion Sort
	public static void InsertionSort(int arr[]) 
	{
		for(int i=1; i<=arr.length-1; i++) 
		{
			int j=i-1;
			int item = arr[i];

			while(j>=0 && arr[j]>item) 
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
		}
		System.out.println("Array After Insertion sorting is :");
		for(int x: arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}




	//	Selection Sort
	public static void SelectionSort(int arr[]) 
	{
		for(int i=0; i<=arr.length-2; i++) 
		{
			int pos = i;
			int min = arr[pos];

			for(int j=i+1; j<=arr.length-1; j++) 
			{
				if(arr[j] < min) 
				{
					min = arr[j];
					pos = j;
				}
			}	
				int temp = arr[pos];
				arr[pos] = arr[i];
				arr[i] = temp;
		}	
		System.out.println("Array After Selection Sorting is :");
		for(int x: arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
}


