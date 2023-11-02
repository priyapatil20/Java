import java.util.Scanner;

public class FruitArray 
{

	public static void main(String[] args) 
	{
		
      Scanner s = new Scanner(System.in);
      System.out.println("Enter number of fruits :");
      int n = s.nextInt();
      
//      creating an array
      String arr[] = new String[n];
      
      
//      storing an array
      for(int i=0; i<arr.length; i++) 
      {
    	  System.out.println("Enter Name of fruit "+(i+1));
    	  arr[i] = s.next();
      }
      
//      displaying an array
      for(int i=0; i<arr.length; i++) 
      {
    	  System.out.println("Name of fruit "+(i+1)+" is : "+arr[i]);
      }
      
	}

}
