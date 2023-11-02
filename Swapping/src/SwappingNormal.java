import java.util.Scanner;

public class SwappingNormal
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter two numbers : ");
		int num1 = s.nextInt(); 
		int num2 = s.nextInt();
		
		System.out.println("Two numbers are : "+num1+" & "+num2);
		
		int x = num1;
		int y = num2;
		
		int z = y;
		y = x;
		x = z;
		
		System.out.println("After swapping two numbers are : "+x+" & "+y);

	}

}
