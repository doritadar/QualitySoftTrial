
public class TestContactList {
	public static void main(String args[]){
		ContactList cl1;
	    cl1 = new ContactList();
		cl1.addNewContact();
		cl1.printContactsList();
		cl1.searchContact();
		System.out.println(cl1);
		System.out.println();
		
		Name person1Name = new Name();
		person1Name.readName();
		System.out.println(person1Name);
		System.out.println();
		
		StreetAddress person1StreetAddress = new StreetAddress();
		person1StreetAddress.readStreetAddress();
		System.out.println(person1StreetAddress);
		System.out.println();		
		
		Person person1;
		person1 = new Person();
		person1.readPerson();
		person1.compare();
		System.out.println(person1);
		System.out.println();
		
		
	}

}


