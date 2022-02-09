package com.bridgelab.addressbook;

import java.util.*;

public class AddressBookEditContactUC3 extends AddressBookAddUC2 {
	static Scanner sc = new Scanner(System.in);
	
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
	public static void main(String[] args) {
		AddressBookEditContactUC3 a = new AddressBookEditContactUC3();			
		a.readData();
		a.DisplayContacts();
		a.editData();
		a.DisplayContacts();


	}
}
