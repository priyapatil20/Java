
public class FibonacciSum {
	
	public static long sumFibonacciSeriesInRange(int start, int end) {
        long sum = 0;
        int first = 0, second = 1;

        while (first <= end) {
            if (first >= start) {
                sum += first;
            }
            int next = first + second;
            first = second;
            second = next;
        }
        return sum;
    }

}
