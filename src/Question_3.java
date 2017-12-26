// This problem involves the question: Largest prime factor
// Problem: What is the largest prime factor of the number 600851475143 ?

// Solved: Nov. 9, 2017

public class Question_3 {
	
	public static void main(String[] args) {
		long value = 600851475143L;
		long largestPrime = 0L;
		
		for (long primeCheck = 1L; primeCheck <= value; primeCheck++) {
			System.out.println(primeCheck);
			if (value % primeCheck == 0) {
				int count = 0;
				for (long i = 1; i <= primeCheck; i++) {
					if (primeCheck % i == 0) {
						count++;
					}
				}
				if (count == 2) {
					largestPrime = primeCheck;
					// Once we have found a prime we can divide the value
					// by it to decrease computational time
					value = value / largestPrime;
				}
			}
		}
		
		// Return the answer
		System.out.println(largestPrime);	
	}

}
