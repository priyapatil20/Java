
public class RangeSumOfSq {
	
public static int RangeSqSum(int start, int end) {
		
		int sum = 0;
		for(int i=start; i<=end; i++) {
			
			int res = sum + (int)Math.pow (i, 2);
			sum = res;
		}
		return sum;
	}

}
