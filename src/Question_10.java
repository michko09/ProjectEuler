// This problem involves the question: Summation of primes
// Problem: Find the sum of all the primes below two million.

// Solved: Nov. 15, 2017

public class Question_10 {

	public static void main(String[] args) {
		long start = 1L;
		long sum = 0L;
		
		while(start < 2000000) {
			long count = 0L;
			System.out.println(start);
			
			for (long i = 1L; i <= start; i++) {
				if (start % i == 0) {
					count++;
					if (count > 2) {
						break;
					}
				}
			}
			
			if (count == 2) {
				sum += start;
			}
			start++;
		}

		System.out.println(sum);
	}

}
