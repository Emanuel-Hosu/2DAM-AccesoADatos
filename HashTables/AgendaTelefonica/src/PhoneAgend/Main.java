package PhoneAgend;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		PhoneBook phoneBook = new PhoneBook();
		int user = 0;
		String name = "";
		Integer phone = 0;

		do {
			System.out.println("--- Phone Book Menu ---\n");
			System.out.print(
					"1. Add/Update Contact\n2. Delete Contact\n3. Search Contact\n4. List All Contacts\n5. Exit\nEnter your choice: ");
			user = scn.nextInt();

			switch (user) {
			case 1: //add/update Contact
				System.out.print("Enter contact name: ");
				name = scn.next();
				System.out.print("Enter phone numbre: ");
				phone = scn.nextInt();
				phoneBook.addPhone(name, phone);
				System.out.println("Contact added/updated successfully");
				break;
			case 2: //Delete Contact
				System.out.print("Enter contact name to delete: ");
				name = scn.next();
				if (phoneBook.deleteContact(name)) {
					System.out.println("Contact deleted successfully");
				}else {
					System.out.println("The contact does not exist");
				}
				break;
			case 3: //Search contact
			    System.out.print("Enter the contact name to search: ");
			    name = scn.next();
			    Integer phoneNumber = phoneBook.searchContact(name);
			    if (phoneNumber != -1) {
			        System.out.println(name + " phone number is: " + phoneNumber);
			    } else {
			        System.out.println("The contact does not exist");
			    }
			    break;
			case 4: //List all contacts
				phoneBook.contactList();
				break;
			case 5: // Exit
		        System.out.println("Exiting...");
		        break;
		    default:
		        System.out.println("Invalid option, please try again.");
		        break;
			}
			
			for (int i = 0; i < 3; i++) {
				System.out.println("");
			}
		} while (user != 5);
	}

}
