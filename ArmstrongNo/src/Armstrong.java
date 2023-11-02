
public class Armstrong {
	
	public static boolean IsArmstrong(int num) {
		
		int org = num;      //153
		int res = 0;
		
		while(org > 0) {
			int mod = org % 10;   //3  5  1
			res = res + (int)Math.pow(mod,3); //27 + 125 + 1
			org = org / 10;      //15  1  0
		}
		return num == res;
	}

}
