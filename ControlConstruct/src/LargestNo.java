
public class LargestNo {

	public static int CheckLargest(int a, int b, int c) {
		
			if(a>b && a>c) {
				return a;
			}
			else if(b>a && b>c) {
				return b;
			}
			else {
				return c;
			}	
	}
	
	public static boolean AllEqual(int a, int b, int c) {
		  
		   return a==b && b==c;
	}
}
