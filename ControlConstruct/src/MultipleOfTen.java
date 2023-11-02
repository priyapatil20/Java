import java.util.Scanner;

public class MultipleOfTen {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a no :");
		int num = s.nextInt();
		
		if(num%10 == 0) {
			System.out.println(num+"is Multiple of 10");
		}
		else {
			System.out.println(num+"is not Multiple of 10");
		}

	}

}
