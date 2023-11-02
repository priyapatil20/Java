import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a no :");
		int num = s.nextInt();
		
		int i = 1;
		while(num>=i) {
			System.out.println(i);
			i++;
		}

	}

}
