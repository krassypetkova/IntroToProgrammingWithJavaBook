/* Declare two variables of type int. Assign to them values 5 and 10 respectively. 
   Exchange (swap) their values and print them. */


package primitiveTypesAndVariables_2;

public class Exercise10 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		int num3;
		
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
