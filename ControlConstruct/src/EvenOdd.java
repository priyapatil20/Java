import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a first no in range :");
		int start = s.nextInt();		
		
		System.out.println("Enter a second no in range :");
		int end = s.nextInt();	
		
		for(int i=start; i<=end; i++) {
			
			if(i%2==0) {
			System.out.println(i+" is a Even no");
			}
			else {
				System.out.println(i+" is a odd no");
			}
		}
	}
}
