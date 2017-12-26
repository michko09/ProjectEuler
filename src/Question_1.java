// This problem involves the question: Multiples of 3 and 5
// Problem: Find the sum of all the multiples of 3 or 5 below 1000.

// Solved: Nov. 8, 2017

public class Question_1 {
	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		
		while (count < 1000) {
			if (count % 5 == 0 || count % 3 == 0) {
				sum += count;
			}
			count++;
		}
		
		// Return the answer
		System.out.println(sum);
	}
}
