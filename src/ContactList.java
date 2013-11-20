
public class ContactList {
	final int MAXCONTACTS= 100;
	int listLength = 0;
	Person [] personList= new Person[MAXCONTACTS];
	
	public ContactList(){

		System.out.println("ContactsList constructor method is reached");
	}
 
	
	public void addNewContact(){
		System.out.println( "addNewContact method is reached");
	}
	public void sortContacts(){
	}
	
	public void printContactsList(){
		System.out.println( "printContactsList method is reached");
	}
	public void searchContact(){
		System.out.println( "searchContact method is reached");
	}
	
	public String toString(){
		return "ContactsList toString() method is reached";
	}
}


