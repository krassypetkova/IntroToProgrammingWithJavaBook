/* Declare two variables of type string and assign them values "Hello" and "World". 
   Declare a variable of type object and assign to it the value obtained of concatenation
   of the two variables of type string (do not miss the space in the middle). Declare a 
   third variable of type string and initialize it with the value of the variable of 
   type object (you should use type casting). */


package primitiveTypesAndVariables_2;

public class Exercise5 {

	public static void main(String[] args) {
		String word1 = "Hello";
		String word2 = "World";
		Object obj = word1 + " " + word2;
		
		System.out.println(obj);
		//cannot convert from Object to String
		//String concatWords = obj1;
	}

}
