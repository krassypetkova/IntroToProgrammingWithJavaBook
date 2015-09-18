/* Write an expression that checks for a given point {x, y} if it is within the circle
   K[{0, 0}, R=5]. Explanation: the point {0, 0} is the center of the circle and 5 is 
   the radius.*/


package operatorsAndExpressions_3;

public class Exercise_8 {

	public static void main(String[] args) {
		int x = 3;
		int y = 2;
		int radius = 5;

		if ((x * x + y * y) < (radius * radius)) {
		    System.out.println("The point is inside the Circle");
		} else {
		    System.out.println("The point is outside the Circle");
		}

	}

}
