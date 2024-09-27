package PhoneAgend;

import java.util.HashMap;

public class PhoneBook {
	//Hasmap que almacena nombres con telefonos
	private HashMap<String, Integer> phoneBook;
	
	public PhoneBook() {
		phoneBook = new HashMap<String, Integer>();
	}
	
	//Añadir o actualizar contacto
	public void addPhone(String _name, Integer _phone) {
		phoneBook.put(_name, _phone);
	}
	
	//Eliminar el contacto si existe ()
	public boolean deleteContact(String _name) {
		if (phoneBook.containsKey(_name)) {
			phoneBook.remove(_name);
			return true;
		}else {
			return false;
		}
	}
	
	//Buscar un contacto()
	public Integer searchContact(String _name) {
		if (phoneBook.containsKey(_name)) {
			return phoneBook.get(_name);
		}else {
			return -1;
		}
	}
	
	//listar todos los contactos si hay
	public void contactList() {
		if (!phoneBook.isEmpty()) {
			System.out.print("Contacts in the phone book :");
			for (String name : phoneBook.keySet()) {
				System.out.print("\nName: " + name + ", Phone: " + phoneBook.get(name));
			}
		}else {
			System.out.println("There's not contacts in the Phone Book");
		}
	}
}
