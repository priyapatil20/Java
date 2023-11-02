import java.util.Scanner;

public class AgeArray 
{

  public static void main(String [] args)
  {
	  Scanner s = new Scanner(System.in);
      System.out.println("Enter number of students :");
      int n = s.nextInt();
      
//      creating an array
      int arr[] = new int[n];
      
//      storing an array
      for(int i=0; i<arr.length; i++) 
      {
         System.out.println("Enter age of student "+(i+1));
         arr[i] = s.nextInt();      
      }
      
//      Displaying an array
      for(int i=0; i<arr.length; i++) 
      {
    	  System.out.println("Age of student "+(i+1)+" is : "+arr[i]); 
      }
      
  }
}
