package com.bridgelab.addressbook;

import java.util.*;

public class AddressBookCollection {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ch;
		int choice;
		Collection c = new Collection();
		do {
			System.out.println("Enter the choice: ");
			System.out.println("1.Add contact ");
			System.out.println("2.Display contact");
			System.out.println("3.Edit contact");
			System.out.println("4.Delete contact");
			ch= sc.nextInt();
			switch(ch) {
			case 1: 
				c.readData();
				break;
			case 2:
				c.DisplayContacts();
				break;
			case 3:
				c.editData();;
				break;
			case 4:
				c.deleteData();
				break;

			}System.out.println("Do you want to continue? if yes then press 1");
			choice = sc.nextInt();
		}while(choice == 1);

	}
}

