/* Write a Boolean expression that checks whether a given integer is divisible by both 5 and 7,
   without a remainder.*/


package operatorsAndExpressions_3;

public class Exercise_2 {

	public static void main(String[] args) {
		int a = 105;
		
		if(a % 5 == 0 && a % 7 == 0) {
			System.out.println("The statement is true.");
		} else {
			System.out.println("The statement is false.");
		}

	}

}
