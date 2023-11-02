package linearSearch;

import java.util.Scanner;

public class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
//		creating an array
		System.out.println("Enter size of an array : ");
		int arr[] = new int[s.nextInt()];
		
//		storing elem in an array 
		System.out.println("Enter "+arr.length+" elements in an array : ");
		for(int i=0;i<arr.length; i++) 
		{
			arr[i] = s.nextInt();
		}
		
		
//		Asking for key to be searched
		System.out.println("Enter key to find in an aaray : ");
		int key = s.nextInt();
		
		
//		Searching key in array in linear search approach
		for(int i=0; i<arr.length; i++) 
		{
//			checking if key is present in array
			if(key == arr[i]) 
			{
				System.out.println("key "+key+" is found at index "+i);
//				if key is present stopping further execution of program
//				System.exit(0);
				return;
			}
		}
//		if key is not present in array then printing below msg 
		System.out.println("Key not found");
	}

}
