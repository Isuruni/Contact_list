package com.Isuruni;


import java.io.*;
import java.util.ArrayList;

public class ContactList {
    ArrayList<Contact> contact_list= new ArrayList<>();

    public void addContact(Contact c){
    contact_list.add(c);

    }
 public void editContact(Contact c){
        for(int i=0;i< contact_list.size();i++){
            if(contact_list.get(i).getName().equals(c.getName())) {
                contact_list.get(i).setPhone_no(c.getPhone_no());
                break;
            }
            else
                continue;
        }
 }
 public void deleteContact(Contact c){
     for(int i=0;i< contact_list.size();i++) {
     if(contact_list.get(i).getName().equals(c.getName())){
         contact_list.remove(i);
         break;
     }
     else
         continue;
     }

 }
 public void displayContact(){
     for(int i=0;i< contact_list.size();i++){
         System.out.println(contact_list.get(i).getName()+" "+contact_list.get(i).getPhone_no());

     }

 }
 public void loadContacts() throws IOException {
     BufferedReader br=new BufferedReader(new FileReader("Contacts.txt"));
     String line=br.readLine();
     while(line!=null){
         System.out.println(line);
         line=br.readLine();
     }
     br.close();
 }
 public void saveContacts() throws IOException{
     PrintWriter pw=new PrintWriter("Contacts.txt");
     for(int i=0;i< contact_list.size();i++){
         pw.println(contact_list.get(i).getName()+" "+contact_list.get(i).getPhone_no());
     }
    pw.close();
 }
}
