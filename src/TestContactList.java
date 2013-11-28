/**
 * TestContactsList tests adding new contacts to the end of list 
 */
public class TestContactsList {
	public static void main(String args[]){
		ContactsList cl1;
	        cl1 = new ContactsList();
		cl1.addNewContact();
		cl1.addNewContact();
		cl1.printContactsList();
		}
	}	


