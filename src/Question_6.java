// This problem involves the question: Sum square difference
// Problem: Find the difference between the sum of the squares of the first one 
//          hundred natural numbers and the square of the sum.

// Solved: Nov. 14, 2017

public class Question_6 {
	
	public static void main(String[] args) {
		int start = 1;
		int squares = 0;
		int sum = 0;
		
		while (start <= 100) {
			squares += Math.pow(start, 2);
			sum += start;
			start++;
		}
		
		sum = (int) Math.pow(sum, 2);
		System.out.println(sum - squares);
	}
}
