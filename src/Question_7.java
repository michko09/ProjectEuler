// This problem involves the question: 10001st prime
// Problem: What is the 10 001st prime number?

// Solved: Nov. 14, 2017

public class Question_7 {

	public static void main(String[] args) {
		int start = 0;
		int numPrimes = 0;
		
		while(numPrimes != 10001) {
			start++;
			int count = 0;
			
			for (int i = 1; i <= start; i++) {
				if (start % i == 0) {
					count++;
				}
			}
			
			if (count == 2) {
				numPrimes++;
			}
		}
		
		System.out.println(start);
	}
}
