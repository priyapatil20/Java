
public class Factorial {
	public static int FindFactorial(int n) {

		int res = 1;
		for(int i=1; i<=n; i++) {

			int mul = res * i;
			res = mul;
		}
		return res;
	}

}
