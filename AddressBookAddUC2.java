package com.bridgelab.addressbook;

import java.util.*;

public class AddressBookAddUC2 {
	private String firstName, lastName, address, city, state, email;
	private int zipCode;
	private long phoneNumber;
	
	static ArrayList<AddressBookUC1> contact = new ArrayList<>();

	public void readData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name: ");
		firstName = sc.next();
		System.out.println("Enter the Last name: ");
		lastName = sc.next();
		System.out.println("Enter the Address: ");
		address = sc.next();
		System.out.println("Enter the City: ");
		city = sc.next();
		System.out.println("Enter the State: ");
		state = sc.next();
		System.out.println("Enter the Zip Code: ");
		zipCode = sc.nextInt();
		System.out.println("Enter the Phone Number: ");
		phoneNumber = sc.nextLong();
		System.out.println("Enter the Email: ");
		email = sc.next();
		AddressBookUC1 contact = new AddressBookUC1(firstName , lastName , address , city , state , zipCode , phoneNumber , email);
  		this.contact.add(contact);
  		System.out.println("\nContact added Successfully.");
  		sc.close();
	}
	
	public void DisplayContacts() {
		int i;
		System.out.println("\nContacts Present in Address Book:");
		for(i = 0 ; i < contact.size() ; i++) {
			System.out.println(contact.get(i));
		}
	}
	
	public static void main(String[] args) {
		AddressBookAddUC2 add = new AddressBookAddUC2();
		add.readData();
		add.DisplayContacts();
	}

}
