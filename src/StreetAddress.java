import java.util.Scanner;
/**
 * Each object of class StreetAddress represent a street address and holds a 
 *  house, street, city, zip and country.
 * @author doritadar
 *
 */
public class StreetAddress {
	private String street;
	private String suite;
	private String city;
	private String state;
	private String zip;
	private String country;
	/**
	 *  The constructor method initializes StreetAddress object's
	 * street, suite, city, zip and country to null.
	 */
	public StreetAddress(){
	 	street = suite = city = state = zip = country = null;
	}
	/**
	 * The readStreetAddress method reads user input from Scanner and
	 * sets the input into the house, street, city, zip and country variables
	 */
	public void readStreetAddress(){
		System.out.println("> Enter address:");
		Scanner AddressScanner;
	   	AddressScanner = new Scanner(System.in);
	   	System.out.print("Street:");
	   	street = AddressScanner.nextLine();
	   	System.out.print("Suite/Apartment:");
	    suite = AddressScanner.nextLine();
	   	System.out.print("City:");
	   	city = AddressScanner.nextLine();
	   	System.out.print("State:");
	   	state= AddressScanner.nextLine();
	   	System.out.print("Zip:");
	   	zip = AddressScanner.nextLine();
	   	System.out.print("Country:");
	   	country = AddressScanner.nextLine();

	}
	/**
	 * ToString method formats street address info
	 */
	public String toString(){
		if ("".equals(suite)){
			return street + " " +
				   city + ", " + state + " " + zip + " " +
				   country ;
		}
		else{
			return street + " " + "suite " + suite + " " +
					city + ", " + state + " " + zip + " " +
					country ;
		}
		
	}
}





