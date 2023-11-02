import java.util.Scanner;

public class LargestNoApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first no :");
		int a = s.nextInt();
		System.out.println("Enter second no :");
		int b = s.nextInt();
		System.out.println("Enter third no :");
		int c = s.nextInt();
		
		if(LargestNo.AllEqual(a, b, c)) {
			
		   System.out.println("All numbers are equal");
		}
		
		else {
			System.out.println("Largest no is : "+LargestNo.CheckLargest(a, b, c));
		}
	}

}
