import java.util.Scanner;


public class Person {
	private Name name;
	private StreetAddress streetAddress;
	private String email;
	private String phoneNum;
	private String notes;
	
	public Person(){
		name = new Name();
		streetAddress = new StreetAddress();
		email = null;
		phoneNum = null;
		notes = null;
	}
	public void readPerson(){
		//System.out.println( "readPerson method is reached");
		name.readName();
		streetAddress.readStreetAddress();
		Scanner PersonScanner;
		PersonScanner = new Scanner(System.in);
		System.out.print("Email:");
		email = PersonScanner.nextLine();
		System.out.print("Phone No:");
		phoneNum = PersonScanner.nextLine();
		System.out.print("Notes:");
		notes = PersonScanner.nextLine();
	}
	public void compare(){
		System.out.println("compare method is reached");
	}
	
	public String toString(){
		return name.toString()+ "\n"
				+ "Phone No: " + phoneNum + "\n"
				+ "Email: " + email+ "\n"
				+ streetAddress.toString() + "\n"
				+ "Notes:" + notes;
	}
}


