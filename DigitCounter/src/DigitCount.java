
public class DigitCount {
	public static int CountDigit(int num) {
		
		int count = 0;
		
		while(num !=0) {
			
			count++;
			num = num/10;
		}
		return count;
	}

}
