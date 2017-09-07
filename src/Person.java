
/*
 * Person with param firstName, lastName, number.
 */
public class Person {
	
	private String firstName;
	private String lastName;
	private int number;
		
	public Person(String firstName, String lastName, int number){
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getNumber() {
		return number;
	}
	
}
