// This problem involves the question: Largest palindrome product
// Problem: Find the largest palindrome made from the product of two 3-digit numbers.

// Solved: Nov. 14, 2017

public class Question_4 {

	public static void main(String[] args) {
		int digit_1 = 1;
		int product;
		int largestProduct = 0;
		
		while(digit_1 < 1000) {
			int digit_2 = 1;
			while(digit_2 < 1000) {
				product = digit_1 * digit_2;
				if (palindromeCheck(product)) {
					largestProduct = returnLarger(largestProduct, product);
				}
				digit_2++;
			}
			digit_1++;
		}
		
		System.out.println(largestProduct);
		
	}
	
	public static boolean palindromeCheck(int number) {
		String toString = Integer.toString(number);
		String[] forwards = toString.split("");
		
		String reverse = new StringBuilder(toString).reverse().toString();
		String[] backwards = reverse.split("");
		
		boolean isPalindrome = true;
		
		for (int index = 0; index < forwards.length; index++) {
			if (!(forwards[index].equals(backwards[index]))) {
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
	}
	
	public static int returnLarger(int currentMax, int possibleMax) {
		if (possibleMax > currentMax) {
			return possibleMax;
		} else {
			return currentMax;
		}
	}
}
