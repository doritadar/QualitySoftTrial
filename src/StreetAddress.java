import java.util.Scanner;
public class StreetAddress {
	private String house,street,city,state,zip,country;
	
public StreetAddress(){
		house = null; 
		street = null;
		city = null;
		state = null;
		zip = null;
		country = null;
	}
 
public void readStreetAddress(){
		
		Scanner AddressScanner;
		AddressScanner = new Scanner(System.in);
		System.out.print("House/Suit:");
		house = AddressScanner.nextLine();
		System.out.print("Street:");
		street = AddressScanner.nextLine();
		System.out.print("City:");
		city = AddressScanner.nextLine();
		System.out.print("State:");
		state= AddressScanner.nextLine();
		System.out.print("Zip:");
		zip = AddressScanner.nextLine();
		System.out.print("Country:");
		country = AddressScanner.nextLine();
		
	}
public String toString(){
		return "Address:" + street 
				+ " House/Suit " + house + ", " 
				+ city + ", "
				+ state + " " + zip + " " + country;
	}
}


