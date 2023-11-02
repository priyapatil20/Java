
public class SumOfSquares {

	public static int SqSum(int num) {
		
		int sum = 0;
		for(int i=1; i<=num; i++) {
			
			int res = sum + (int)Math.pow (i, 2);
			sum = res;
		}
		return sum;
	}
}
