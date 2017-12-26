// This problem involves the question: Smallest multiple
// Problem: What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

// Solved: Nov. 14, 2017

public class Question_5 {
	
	public static void main(String[] args) {
		int smallest = 0;
		boolean isFound = false;
		
		while(isFound == false) {
			smallest++;
			boolean passedAll = true;
			
			for (int i = 1; i <= 20; i++) {
				if (smallest % i != 0) {
					passedAll = false;
				}
			}

			if (passedAll == true) {
				isFound = true;
			}
		}
		
		System.out.println(smallest);
	}
	
}
