
public class AgeCalculation {

	public static void CalculateAge(int age) {
		
		if(age>=0 && age<=12) {
			System.out.println("Child");
		}
		else if(age>=13 && age<=19) {
			System.out.println("Teen");
		}		
		else if(age>=20 && age<=59) {
			System.out.println("Adult");
		}	
		else {
			System.out.println("Senior");
		}
		
	}
}
