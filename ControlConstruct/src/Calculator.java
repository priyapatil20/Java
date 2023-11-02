import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int num1 = s.nextInt();
		System.out.println("Enter second number :");
		int num2 = s.nextInt();

		System.out.println("Enter operation to be performed : +, -, *, /, % ");
		char ch = s.next().charAt(0);
		
		switch (ch)
		{
		  case '+' : System.out.println("Addition of"+ num1 +"and"+ num2 +"is :"+(num1 + num2));
		  break;
		  
		  case '-' : 
			  if(num1>num2)
			      System.out.println("Subtraction of"+ num1 +"and"+ num2 +"is :"+(num1 - num2));
			  else
				  System.out.println("Subtraction of"+ num1 +"and"+ num2 +"is :"+(num2 - num1));
		  break;
		  
		  case '*' : System.out.println("Multiplication of"+ num1 +"and"+ num2 +"is :"+(num1 * num2));
		  break;
		  
		  case '/' : System.out.println("Division of"+ num1 +"and"+ num2 +"is :"+(num1 / num2));
		  break;
		  
		  case '%' : System.out.println("Modulus of"+ num1 +"and"+ num2 +"is :"+(num1 % num2));
		  break;
		  
		  default : System.out.println("Invalid Operation");
		  
		}
	}

}
