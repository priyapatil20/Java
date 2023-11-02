
public class RangeArmstrong {

	public static boolean ArmstrongRange(int num) {

		int org = num;      //153
		int n = 0;
		int res = 0;
		
		 // Find the number of digits in the original number
		while(org!=0) {
			org = org/10;
			n++;
		}
		
		org = num;

		 // Calculate the sum of the nth powers of its digits
		while(org!=0) {
			int mod = org % 10;   //3  5  1
			res = res + (int)Math.pow(mod,n); //27 + 125 + 1
			org = org / 10;      //15  1  0
		}
		return num == res;
	}
}
