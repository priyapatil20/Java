import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number :");
		int start = s.nextInt();
		System.out.println("Enter last number :");
		int end = s.nextInt();
		
		System.out.println("Product of odd numbers between "+start+" and "+end+" is : "+Product.ProductRange(start, end));

	}

}
