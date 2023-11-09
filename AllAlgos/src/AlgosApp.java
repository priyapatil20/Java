import java.util.Scanner;

public class AlgosApp {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter size of an array");
//		array creation
		int arr[] = new int[s.nextInt()];
		
		
		System.out.println("Enter "+arr.length+" elements in an array");
		for(int i=0; i<=arr.length-1; i++) 
		{
			arr[i] = s.nextInt();
		}
		
		System.out.println("Elements in an array are");
		for(int x : arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		

		System.out.println("Enter 1 : for checking if elements are sorted \nEnter 2 : for performing linear search  \nEnter 3 : for performing binery search  \nEnter 4 : for performing bubble sort \nEnter 5 : for performing insertion sort \nEnter 6 : for performing selection sort");
		int choice = s.nextInt();

		switch(choice)
		{
		case 1 : Algos.CheckSort(arr);
		break;

		case 2 : Algos.LinearSearch(arr);
		break;

		case 3 : Algos.BinarySearch(arr);
		break;

		case 4 : Algos.BubbleSort(arr);
		break;

		case 5 : Algos.InsertionSort(arr);
		break;

		case 6 : Algos.SelectionSort(arr);
		break;
		
		default : System.out.println("Invalid Choice");
		}

	}

}
