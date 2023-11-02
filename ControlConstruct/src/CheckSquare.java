import java.util.Scanner;

public class CheckSquare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length :");
		int l = s.nextInt();
		System.out.println("Enter breadth :");
		int b = s.nextInt();
		
		
		if(IsSquareCheck.IsSquare(l,b)) {
			System.out.println("Given rectangle is a square");
		}
		else {
			System.out.println("Given rectangle is not square");
		}
	}

}
