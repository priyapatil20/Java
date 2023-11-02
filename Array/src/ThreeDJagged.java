import java.util.Scanner;

public class ThreeDJagged {

	public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
       
//       enter number of colgs
       System.out.println("Enter no of colgs  : ");
       int arr[][][] = new int[s.nextInt()][][];  //total 3[] as 3D array
       
//       enter number of classes in each colgs
       for(int i=0; i<arr.length; i++) 
       {
    	
    	   System.out.println("Enter no of classes in colg "+(i+1));
    	   arr[i] = new int[s.nextInt()][];   //total 3[] as 3D array
       }
       
       
//       enter no of students in each classes in each colgs
       for(int i=0; i<arr.length; i++) 
       {
    	
    	   for(int j=0; j<arr[i].length; j++) 
    	   {
    	      System.out.println("Enter no of students in class "+(j+1)+" of colg "+(i+1));
    	      arr[i][j] = new int[s.nextInt()];   //total 3[] as 3D array
    	   }   
       }
       

//       storing contents
       for(int i=0; i<arr.length; i++) 
       {
    	   for(int j=0; j<arr[i].length; j++) 
    	   {
    		   for(int k=0; k<arr[i][j].length; k++) 
    		   {
    			   System.out.println("enter age of student in class "+(j+1)+" of colg "+(i+1)+" : ");
    			   arr[i][j][k] = s.nextInt();
    		   }
    	   }
       }
       
       
//       displaying content
       for(int i=0; i<arr.length; i++) 
       {
    	   for(int j=0; j<arr[i].length; j++) 
    	   {
    		   for(int k=0; k<arr[i][j].length; k++) 
    		   {
    			   System.out.println("age of student "+(k+1)+" in class "+(j+1)+" of colg "+(i+1)+" is : "+arr[i][j][k]);
    			    
    		   }
    	   }
       }
       
	}

}
