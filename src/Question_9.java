// This problem involves the question: Special Pythagorean triplet
// Problem: There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//			Find the product abc.

// Solved: Nov. 14, 2017

public class Question_9 {

	// Pythagorean triplet: a < b < c
	public static void main(String[] args) {
		int b = 1;
		int squareSum;
		boolean found = false;
		int finalAnswer = 0;
		
		while(!(found)) {
			for (int a = 1; a < b; a++) {
				squareSum = (int) (Math.pow(a, 2) + Math.pow(b, 2));
				if (perfectSquare(squareSum)) {
					if (a + b + (int) Math.sqrt(squareSum) == 1000) {
						finalAnswer = a * b * (int) Math.sqrt(squareSum);
						found = true;
					}
				}
			}
			
			b++;
		}
		
		System.out.println(finalAnswer);
	}
	
	public static boolean perfectSquare(int number) {
		int toInt = (int) Math.sqrt(number);
		double toSquare = Math.pow(toInt, 2);
		
		if (toSquare == number) {
			return true;
		} else {
			return false;
		}
	}
}
