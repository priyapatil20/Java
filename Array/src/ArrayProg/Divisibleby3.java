
// java program to replace elements in an array which are divisible by 3 with -1

package ArrayProg;

import java.util.Scanner;

public class Divisibleby3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter no of elements in an array : ");
//		creting array
		int arr[] = new int[(s.nextInt())];
		
//		storing elem in an array
		System.out.println("enter elem in an array : ");
		for(int i=0; i<arr.length; i++) 
		{
			arr[i] = s.nextInt();
			
		}
		
//		displaying elem in an array
		System.out.println("elem in an array are : ");
		for(int num : arr) 
		{
			System.out.print(num+" ");
			
		}
		System.out.println();
		
		
//		replacing elements divisible by 3 with -1
		System.out.println("after replacing elements divisible by 3 with -1,array elements are : ");
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i]%3==0) 
			{
				arr[i] = -1;
             
			}
			System.out.print(arr[i]+" ");
		}	
		

	}

}
