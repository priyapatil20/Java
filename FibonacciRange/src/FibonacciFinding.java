
public class FibonacciFinding {

	public static void Fibonacci(int start, int end) {
		
		int first = 0, second = 1;
        while (first <= end) {
            if (first >= start) {
                System.out.print(first + " ");
            }
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
