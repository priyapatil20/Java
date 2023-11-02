
public class Palindrome {
	
	public static boolean IsPalindrome(int num) {
		
		int org = num;
		int reverse = 0;
		
		while(org>0) {
			
			int mod = org % 10;
			reverse = reverse * 10 + mod;
			org = org /10;
		}
		return num == reverse;
	}

}
