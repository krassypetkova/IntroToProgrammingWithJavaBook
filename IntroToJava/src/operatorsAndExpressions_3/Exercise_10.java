/*Write a script that takes as input a four-digit number in format abcd (e.g. 1234)
and performs the following actions:
  -Calculates the sum of the digits (in our example 1 + 2 + 3 + 4 = 10).
  -Prints on the console the number in reversed order: dcba (in our example 4321).
  -Puts the last digit in the first position: dabc (in our example 4123).
  -Exchanges the second and the third digits: acbd (in our example 1324). */


package operatorsAndExpressions_3;

public class Exercise_10 {

	public static void main(String[] args) {
		int num = 1234;

		int a = num % 10;
		int b = (num / 10) % 10;
		int c = (num / 100) % 10;
		int d = (num / 1000) % 10;

		System.out.println("Sum:" + " " + (a + b + c + d));
		System.out.println("Reverse order:" + " " + a + b + c + d);
		System.out.println("The last is first:" + " " + a + d + c + b);
		System.out.println("The three is two:" + " " + d + b + c + a);
	}

}
