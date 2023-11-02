
// copying even elements from arr1 and arr2 into arr3

package ArrayProg;

import java.util.Scanner;

public class MergingEvenNoElem
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter number of elements in arr1 : ");
        int arr1[] = new int[s.nextInt()];
        
        System.out.println("Enter number of elements in arr2 : ");
        int arr2[] = new int[s.nextInt()];
        
        
//        storing elem 
        System.out.println("Enter elem in arr1 : ");
        for(int i=0; i<arr1.length; i++) 
        {
        	arr1[i] = s.nextInt();
        }
        
        System.out.println("Enter elem in arr2 : ");
        for(int i=0; i<arr2.length; i++) 
        {
        	arr2[i] = s.nextInt();
        }
        
        
//      count no of even elem of arr1 & arr2
        int count = 0;
        for(int num : arr1) 
        {
        	if(num%2==0) {
        		count++;
        	}
        }
        
        for(int num : arr2) 
        {
        	if(num%2==0) {
        		count++;
        	}
        }
        
//      creating arr3 for holding even elem
        int arr3[] = new int[count];
        
        int index =0;
        
//      copy even elem from arr1 to arr3
        for(int num: arr1) 
        {
        	if(num%2==0) 
        	{
        		arr3[index]=num;
        		index++;
        	}
        }
        
//     copy even elem from arr2 to arr3
        for(int num: arr2) 
        {
        	if(num%2==0) 
        	{
        		arr3[index]=num;
        		index++;
        	}
        }
        
        
        
        System.out.println("elem in arr1 are : ");
        for(int num: arr1) 
        {
        	System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("elem in arr2 are : ");
        for(int num: arr2) 
        {
        	System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Even elem in arr3 are : ");
        for(int num: arr3) 
        {
        	if(num %2==0) 
        	{
        	  System.out.print(num+" ");
        	} 
        }
        
	}

}
