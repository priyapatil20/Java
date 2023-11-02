
public class Product {

	public static int ProductRange(int start, int end) {
		
		int product = 1;
		for(int i=start; i<=end; i++) {
			
			if(i%2!=0) {
				
			  product = product * i;	
			}
		}
		return product;
	}
}
