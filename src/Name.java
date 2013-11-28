import java.util.Scanner;
/**
 * Each object of class Name represent a name and holds the last name and first name
 * @author doritadar
 */
public class Name {
	private String lastName;
	private String firstName;
	/**
	 * Constructor method initializes firstName and lastName to Null
	 */
	public Name(){
		lastName = "";
		firstName = "";
	}
	
	/**
	 * ReadName method reads lastName and firstName from Scanner
	 * and sets the input into the lastName and firstName variables.
	 */
    public void readName(){
    	Scanner nameScanner = new Scanner(System.in);
    	System.out.println( "> Enter name"); 
    	while ("".equals(lastName)){       // check lastName was entered
    		System.out.print("Last Name (required):");
    		lastName = nameScanner.nextLine();
    	}
		System.out.print("First Name:");
	    firstName = nameScanner.nextLine();
	    
    	}
    
    /**
     * ToString methods formats Name info 
     */
	public String toString(){
		return firstName + " " + lastName;
	}
}

