import java.util.Scanner;

public class CbrtRangeApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting number :");
		int start = s.nextInt();
		System.out.println("Enter ending number :");
		int end = s.nextInt();

		if (start > end) {
            System.out.println("Invalid range: end is greater than start");
            return;
        }
		
		System.out.println("Cube roots of number between "+start+" and "+end+" are : ");
		
		for (int num = start; num <= end; num++) {
			double CubeRoot = CbrtRange.FindCbrt(num);
			System.out.println("Cube root of " + num + " is: " + CubeRoot);

		}

	}

}
