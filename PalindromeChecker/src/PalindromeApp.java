import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = s.nextInt();

		if(Palindrome.IsPalindrome(num)) {
			System.out.println(num+" is a pallindrome no");
		}
		else {
			System.out.println(num+" is not a pallindrome no");
		}
	}

}
