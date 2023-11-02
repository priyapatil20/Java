import java.util.Scanner;

public class GradeCheckApp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter marks : ");
		int marks = s.nextInt();
  
		GradeCheck.GradeChecker(marks);

	}
}
	
