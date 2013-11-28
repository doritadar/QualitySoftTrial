import java.util.Scanner;

/**
 *  Eaah object of class Person represents a person and holds its name, address,
 *  email, phone number and notes.
 * @author doritadar
 *
 */
public class Person {
	private Name name = new Name();
	private StreetAddress streetAddress = new StreetAddress();
	private String email;
	private String phoneNum;
	private String notes;
	/**
	 * The constructor method initializes a person's name,
	 *  address, email, phone number and notes to null.
    */
	public Person(){
		
	}
	public String getName(){
		return name.toString();
	}
	/**
	 * The readPerson method reads user input from scanner and 
	 * sets the input into the name, address, email, phone number and notes variables.
    */
	public void readPerson(){
		name.readName();
		streetAddress.readStreetAddress();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Email:");
	    email = scanner.nextLine();
		System.out.print("Enter Phone Num:");
	    phoneNum = scanner.nextLine();
		System.out.print("Notes:");
	    notes = scanner.nextLine();
		}
	/**
	 * A method compares this Person to the other Person,
	 * and returns an int.
	 * Returns negative int if thisPerson < otherPerson.
	 * Returns zero if thisPerson == otherPerson.
	 * Returns positive int if thisPerson > otherPerson.
	 * @param otherPerson
	 */

	public int compareTo(Person otherPerson){
		return 0;
	}
	/**
	 * The toString method formats data of a Person object.
	 */
	public String toString(){
		return "\n" + name + "\n" +
			   "Phone Num: " + phoneNum  + "\n" +
			   "Email: " + email + "\n" +
			   "Address: " + streetAddress + "\n"+
			   "Notes: " + notes + "\n" ; 
	}
}




