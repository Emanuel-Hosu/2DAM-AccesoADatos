/**
 * Represents a simple phone book that stores contacts with their phone numbers.
 * This class provides basic operations for managing contacts such as adding,
 * deleting, searching, and listing all contacts.
 */
package PhoneAgend;

import java.util.HashMap;

public class PhoneBook {
    /** HashMap that stores contact names as keys and phone numbers as values */
    private HashMap<String, Integer> phoneBook;

    /**
     * Constructs a new PhoneBook with an empty HashMap.
     */
    public PhoneBook() {
        phoneBook = new HashMap<String, Integer>();
    }

    /**
     * Adds a new contact or updates an existing contact in the phone book.
     *
     * @param name  the name of the contact
     * @param phone the phone number of the contact
     */
    public void addPhone(String name, Integer phone) {
        phoneBook.put(name, phone);
    }

    /**
     * Deletes a contact from the phone book if it exists.
     *
     * @param name the name of the contact to be deleted
     * @return true if the contact was successfully deleted, false otherwise
     */
    public boolean deleteContact(String name) {
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Searches for a contact in the phone book.
     *
     * @param name the name of the contact to search for
     * @return the phone number of the contact if found, or -1 if not found
     */
    public Integer searchContact(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            return -1;
        }
    }

    /**
     * Lists all contacts in the phone book if any exist.
     * Prints the contacts to the console.
     */
    public void contactList() {
        if (!phoneBook.isEmpty()) {
            System.out.print("Contacts in the phone book:");
            for (String name : phoneBook.keySet()) {
                System.out.print("\nName: " + name + ", Phone: " + phoneBook.get(name));
            }
        } else {
            System.out.println("There are no contacts in the Phone Book");
        }
    }
}