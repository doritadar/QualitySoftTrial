mport java.util.*;
/**
 * Each ContactsList object is an array of Person objects.
 * @author doritadar
 *
 */
public class ContactsList {
	ArrayList<Person> contactsList = new ArrayList<Person>();
	/**
	 * The constructor method initializes each element of of ContactsList to null 
	 * when ArrayList is created. 
	 */
	public ContactsList(){
		System.out.println("ContactsList constructor method is reached");
	}
	/**
	 * The addNewContact method handles adding a new Person contact to the
	 *  end of the list.
	 */
	public void addNewContact(){
		Person person = new Person();
		person.readPerson();
		contactsList.add(person);
		System.out.println(person.getName() +" was succesfuly added to your contacts!");
	}
	/**
	 * The SortContacts method sorts contcatsList according to alphabetical order
	 */
	public void sortContacts(){
	}
	/**
	 *The printContactList method displays all the contacts sorted by alphabetical
	 *order of last name.
	 * When there is more than one contact with the same lastName, the method
	 * sub sorts the sub list of same lastName and displays it by alphabetical
	 * order of firstName.
	 **/
	
	public void printContactsList(){
		System.out.println(contactsList);
	}
	/** 
	 * The searchContacts method gets a parameter of lastName and searches the
	 *  contactList for matches.
	 *  The method will display all data of matched contacts,
	 *  sorted by alphabetical order of firstName.
	 *  If no match found, the method will display a message.
	 * @param lastName
	 */
	public void searchContact(String lastName){
		System.out.println( "searchContact method is reached");
	}
	
}


