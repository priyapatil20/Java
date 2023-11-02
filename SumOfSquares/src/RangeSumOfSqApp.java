import java.util.Scanner;

public class RangeSumOfSqApp {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting number :");
		int start = s.nextInt();
		System.out.println("Enter ending number :");
		int end = s.nextInt();

		System.out.println("Sum of Squares of numbers between "+start+" and "+end+" is "+RangeSumOfSq.RangeSqSum(start,end));
	}


}
