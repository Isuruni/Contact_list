package com.Isuruni;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {
        Scanner input= new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        ContactList list=new ContactList();

        while (true) {
            System.out.println("Enter 1 to display all contacts");
            System.out.println("Enter 2 to add contact");
            System.out.println("Enter 3 to remove contact");
            System.out.println("Enter 4 to edit a contact");
            System.out.println("Enter 5 to load contacts from a text file.");
            System.out.println("Enter 6 to save contacts to the text file.");
            System.out.println("Enter 7 to exit from the program");
            System.out.println();


            Contact contact=new Contact();
            System.out.println("Enter your option:");
            int option=input.nextInt();

        switch(option){
            case 1:
                list.displayContact();

                break;
            case 2:
                System.out.println("Please enter name:");
                String name=input1.nextLine();
                System.out.println("Please add phone number:");
                String no=input1.nextLine();
                contact.setName(name);
                contact.setPhone_no(no);
                list.addContact(contact);
                break;
            case 3:
                System.out.println("Please enter name of the contact that you want to delete:");
                name=input1.nextLine();
                contact.setName(name);
                list.deleteContact(contact);
                break;
            case 4:
                System.out.println("“Please enter name of the contact that you want to change:");
                name=input1.nextLine();
                contact.setName(name);
                System.out.println("Please enter the new phone number:");
                no=input1.nextLine();
                contact.setPhone_no(no);
                list.editContact(contact);
                break;
            case 5:
                list.loadContacts();
                break;
            case 6:
                list.saveContacts();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + option);
        }
        }
    }
}
