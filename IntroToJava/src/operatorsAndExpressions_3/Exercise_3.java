/* Write an expression that checks for a given integer if its third digit (right to left) is 7.*/

package operatorsAndExpressions_3;

public class Exercise_3 {

	public static void main(String[] args) {
		int a = 727;
		int b = a / 100;
		
		if(b % 10 == 7){
			System.out.println("The third digits is 7!");
		} else {
			System.out.println("The third digits is not 7!");
		}
		

	}

}
