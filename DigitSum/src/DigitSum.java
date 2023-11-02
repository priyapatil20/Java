
public class DigitSum {

	public static int FindDigitSum(int n) {

		int org = n; //121
		int sum = 0;

		while(org!=0) {

			int mod = org % 10; //1   2  1
			sum = sum + mod;    //1   3  4
			org = org / 10;     //12  1  0

		}

		return sum;
	}
}
