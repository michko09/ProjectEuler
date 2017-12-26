// This problem involves the question: Even Fibonacci numbers
// Problem: By considering the terms in the Fibonacci sequence whose values 
//          do not exceed four million, find the sum of the even-valued terms.

// Solved: Nov. 8, 2017

public class Question_2 {
	public static void main(String[] args) {
		int sum = 0;
		int value1 = 0;
		int value2 = 1;

		// Return the answer
		System.out.println(getFib(value1, value2, sum));
	}

	static int getFib(int value1, int value2, int sum) {
		int fib = value1 + value2;
		if (fib % 2 == 0) {
			sum += fib;
		}
		if (fib <= 4000000) {
			return getFib(value2, fib, sum);
		} else {
			return sum;
		}
	}
}
