// Swapping two indexes of an array

import java.util.Scanner;

public class SwappingArrayElem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter size of an array : ");
		int arr[] = new int[s.nextInt()];
		
//		enter elem in an array
		System.out.println("Enter "+arr.length+" elem in an array : ");
		for(int i=0; i<=arr.length-1; i++) 
		{
			arr[i] = s.nextInt();
		}
		
//		print elem in an array
		System.out.println("Elem in an array are : ");
		for(int x : arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
//		enter any two array indexes to be swapped
		System.out.println("Enter any two array indexes for swapping ");
		int i1 = s.nextInt();
		int i2 = s.nextInt();
		
//		checking whether entered indexes are present in index of array
        if(i1>=0 && i1<=arr.length-1  && i2>=0 && i2<=arr.length-1) 
        {
//        	swapping elem at both indexes
        	int temp = arr[i1];
        	arr[i1] = arr[i2];
        	arr[i2] = temp;
        
//        	displaying array elem after swapping
        	System.out.println("After swapping two numbers array elem are :");
        	for(int x : arr) 
        	{
        		System.out.print(x+" ");
        	}
        }
        else 
        {
//        	displaying msg to enter valid indexes
        	System.out.println("Enter indexes between 0 and "+(arr.length-1));
        }
		
		
	}

}
