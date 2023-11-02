import java.util.Scanner;

public class FibonacciRangeApp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting no: ");
		int start = s.nextInt();
		System.out.println("Enter ending no: ");
		int end = s.nextInt();
	
		  
		if (start > end || start < 0) {
            System.out.println("Invalid input. Please ensure the starting range is non-negative and less than or equal to the ending range.");
        } else {
            System.out.println("Fibonacci Series within the range:");
            FibonacciFinding.Fibonacci(start, end);
        }
			
		

	}

}
