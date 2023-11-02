import java.util.Scanner;

public class RangeArmstrongApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting number :");
		int start = s.nextInt();
		System.out.println("Enter ending number :");
		int end = s.nextInt();

		System.out.print("Armstrong no between "+start+" and "+end+" are : ");
		for(int i=start; i<=end; i++) {
			if(RangeArmstrong.ArmstrongRange(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
