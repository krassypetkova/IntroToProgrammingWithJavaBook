/* A company dealing with marketing wants to keep a data record of its employees. 
   Each record should have the following characteristic – first name, last name, 
   age, gender (‘m’ or ‘f’) and unique employee number (27560000 to 27569999). 
   Declare appropriate variables needed to maintain the information for an employee
   by using the appropriate data types and attribute names.*/


package primitiveTypesAndVariables_2;

public class Exercise9 {

	public static void main(String[] args) {
		
		String firstName = "Krasimira";
		String lastName = "Petkova";
		byte age = 25;
		char gender = 'f';
		int employeeNumber = 27561234;
		
		System.out.println("first name:" + " " + firstName);
		System.out.println("last name:" + " " + lastName);
		System.out.println("age:" + " " + age);
		System.out.println("gender:" + " " + gender);
		System.out.println("employee number:" + " " + employeeNumber);

	}

}
