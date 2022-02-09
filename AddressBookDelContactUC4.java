package com.bridgelab.addressbook;

import java.util.*;

public class AddressBookDelContactUC4 extends AddressBookAddUC2{
	static Scanner sc = new Scanner(System.in);
	public void deleteData() {
		int i;
		System.out.println("\nEnter first name to delete : ");
		String name = sc.next();
		for(i = 0 ; i < contact.size() ; i++) {
			if(contact.get(i).getFirstName().equals(name)) {
				contact.removeAll(contact);
				System.out.println("Contact is deleted");
			}
			else
				System.out.println("No one with these details found");
		}
	}

	public static void main(String[] args) {
		AddressBookEditContactUC3 edit = new AddressBookEditContactUC3();
		AddressBookDelContactUC4 del = new AddressBookDelContactUC4();
		edit.readData();
		edit.DisplayContacts();
		edit.editData();
		del.DisplayContacts();
		del.deleteData();
	}

}
