
public class SingleSum {
	
	public static int FindingSingleSum(int n) {
		
		int sum = 0;
		int org = n;
		
		while(org!=0) {
			
			int digit = org % 10;
			sum = sum + org;
			org = org / 10;
			
			while(sum>=0 && sum<=9) {
				
				int singleSum = sum % 10;
				int Fsum = Fsum + sum;
				sum = sum / 10;
			}
		}
		
		return Fsum;
	}

}
