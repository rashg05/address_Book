package com.bridgelab.addressbook;

import java.util.*;

public class Collection {
	private String firstName, lastName, address, city, state, email;
	private int zipCode;
	private long phoneNumber;
	static ArrayList<AddressBookUC1> contact = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public void readData() {
	     int i ;
	     boolean b= false;
		System.out.println("Enter the first name: ");
		firstName = sc.next();
		System.out.println("Enter the last name: ");
		lastName = sc.next();
		System.out.println("Enter the address: ");
		address = sc.next();
		System.out.println("Enter the city: ");
		city = sc.next();
		System.out.println("Enter the state: ");
		state = sc.next();
		System.out.println("Enter the zip code: ");
		zipCode = sc.nextInt();
		System.out.println("Enter the phone number: ");
		phoneNumber = sc.nextLong();
		System.out.println("Enter the email: ");
		email = sc.next();
		
		for(i=0;i<contact.size();i++) {
			if(contact.get(i).getFirstName().equals(firstName)&&contact.get(i).getLastName().equals(lastName)) {
				System.out.println("The name you have entered is exist");
				  b = true;
			      break;
		 	 }
		}
		if(b== false) {
			AddressBookUC1 contact = new AddressBookUC1(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
	  		this.contact.add(contact);
	  		System.out.println("\nContact added Successfully.");
		}
		
	}
	
	public void editData() {
		int i,ans;
		System.out.println("\nEnter First Name you want to Edit :- ");
		String name = sc.next();
		for(i = 0 ; i < contact.size() ; i++) {
			if(contact.get(i).getFirstName().equals(name)) {
				do {
					System.out.print("\nSelect option to Edit: \n1.First Name \n2.Last Name \n3.Address \n4.City \n5.State \n6.Zip Code \n7.Phone Number \n8.Email : ");
					int ch = sc.nextInt();
					switch(ch) {
					case 1:
						System.out.print("Enter new first name :- ");
						contact.get(i).setFirstName(sc.next());
						System.out.println("[*]\tEntry Modified");
						break;
					case 2:
						System.out.print("Enter new last name :- ");
						contact.get(i).setLastName(sc.next());
						System.out.println("[*]\tEntry Modified");
						break;
					case 3:
						System.out.print("Enter new address :- ");
						contact.get(i).setAddress(sc.next());
						System.out.println("[*]\tEntry Modified");
						break;
					case 4:
						System.out.print("Enter new city :- ");
						contact.get(i).setCity(sc.next());
						System.out.println("[*]\tEntry Modified");
						break;
					case 5:
						System.out.print("Enter new state :- ");
						contact.get(i).setState(sc.next());
						System.out.println("[*]\tEntry Modified");
						break;
					case 6:
						System.out.print("Enter new zip code :- ");
						contact.get(i).setZipCode(sc.nextInt());
						System.out.println("[*]\tEntry Modified");
						break;
					case 7:
						System.out.print("Enter new phone number :- ");
						contact.get(i).setPhoneNumber(sc.nextLong());
						System.out.println("[*]\tEntry Modified");
						break;
					case 8:
						System.out.print("Enter new email :- ");
						contact.get(i).setEmail(sc.next());
						System.out.println("[*]\tEntry Modified");
						break;
					}
					System.out.println("If you want to continue, enter 1");
					ans = sc.nextInt();
				}while(ans == 1);
			}
			else
				System.out.println("Please enter First Name");
		}
		sc.close();

	}
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
	public void DisplayContacts() {
		System.out.println("\nContacts Present in Address Book:");
		for(int i=0;i<contact.size();i++) {
			System.out.println(contact.get(i));
		}
	}
}
