import java.util.Scanner;

public class Name {
	private String lastName;
	private String firstName;
	
public Name(){
		lastName = null;
		firstName = null;
	}
 
public void readName(){
		Scanner NameScanner;
		NameScanner = new Scanner(System.in);
		System.out.print("Last name(required):");
		lastName = NameScanner.nextLine();
		
		if(lastName != null){
			System.out.print("First Name:");
			firstName = NameScanner.nextLine();
		}
		else{
			System.out.println("Last Name is required to create a new contact, please try again.");
			readName();
	}
}
public String toString(){
		return "Name:" + firstName + " " + lastName;
			
	}
}
