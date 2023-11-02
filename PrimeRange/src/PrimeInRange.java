
public class PrimeInRange {
	
public static int IsPrime(int num) {
		
		for(int i=2; i<num; i++){ 
			
			if(num %i==0) {
				return -1;
			}
		}
		return num;
	}


}
