import java.util.Scanner;

public class PrimeInRangeApp {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter starting num in range : ");
		int start = s.nextInt();
		System.out.println("Enter ending num in range : ");
		int end = s.nextInt();
		
		System.out.println("Prime no between "+start+" to "+end+" is : ");
		for(int num=start; num<end; num++) {
		   
	
			if(PrimeInRange.IsPrime(num)!= -1) {
				
				System.out.println(num);
			}
		 
		}
		

	}

}
