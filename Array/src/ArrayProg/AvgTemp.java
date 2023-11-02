
// program to find avg temp of a week

package ArrayProg;

import java.util.Scanner;

public class AvgTemp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int arr[] = new int[7];
		
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println("Temp of day "+(i+1)+" is : ");
			arr[i] = s.nextInt();
		}

		int sum =0;
		for(int i=0; i<arr.length; i++) 
		{
			sum = sum + arr[i];
		}
		System.out.println("sum of temps of a week is : "+sum);
		
		
        int avg = sum / arr.length;
        System.out.println("Avg temp of a week is : "+avg);
	}

}
