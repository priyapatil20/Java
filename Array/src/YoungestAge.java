
// program to find youngest student of a class


import java.util.Scanner;

public class YoungestAge {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter no of students  :");
		int arr[] = new int[s.nextInt()];
		
		
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println("Enter age of student "+(i+1));
			arr[i] = s.nextInt();
		}
		
		
		System.out.print("ages of students are : ");
		for(int num : arr) 
		{
			System.out.print(num+"  ");
		}
		System.out.println();
		
		
		int YoungAge = arr[0];
		for(int i=0; i<arr.length; i++) 
		{
			if (arr[i] < YoungAge) 
			{
				YoungAge = arr[i];
			}
		}
		System.out.print("Younger student's age is : "+YoungAge);
	}
}
