/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nhat Hoang
 */
public class ContactList {
    List<Contact> ContactList = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public void AddContact(){
        System.out.print("Enter the quantity you want to add: ");
        int n = sc.nextInt();
        sc.nextLine();
        String name;
        String tel;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter new contact name" + (i+1) + " : ");
            name = sc.nextLine();
            System.out.print("Enter phone number" + (i+1) + " : ");
            tel = sc.nextLine();
            //sc.nextLine();
            Contact x = new Contact(name, tel);
            x.setName(name);
            x.setTel(tel);
            ContactList.add(x);
            //System.out.println("New contact added : " + " name : " + name + " , " + " phone : " + tel );
            //System.out.println();
        }
        System.out.println("\nNew contact added: ");
        for (int i = 0; i < n; i++) {
            System.out.println(  "Name: " + ContactList.get(i).getName() + ", " + "Phone number: " + ContactList.get(i).getTel());
        }
    }
    public void UpdateContact(){
        System.out.println("Contact List");
        for (int i = 0; i < ContactList.size(); i++) {
            System.out.println((i+1) + "." + ContactList.get(i).getName() + " -> " + ContactList.get(i).getTel());
        }
        System.out.println("Enter name and phone you want to edit");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Phone number: ");
        String tel = sc.nextLine();
        //sc.nextLine();
        int count = 0;
        for (int i = 0; i < ContactList.size(); i++) {
            if(name == ContactList.get(i).getName() &&  tel.compareTo(ContactList.get(i).getTel()) == 0){
                //name.compareTo(ContactList.get(i).getName()) == 0
                String name2 = name;
                System.out.print("New name: ");
                String name1 = sc.nextLine();
                System.out.print("New tel: ");
                String tel1 = sc.nextLine();
                Contact newContact = new Contact(name1,tel1);
                ContactList.set(i, newContact);
                count++;
                System.out.println(name2 + "," + " was replaced with " + name1 + " and number " +tel1);
                System.out.println("Successfully updated record");
            }
        }
        if(count == 0 ){
            System.out.println("There is not contact you want to edit");
           //System.out.print("Do you want to try again?");
        }
    }
    public void ShowList(){
        System.out.println("Contact List");
        for (int i = 0; i < ContactList.size(); i++) {
            System.out.println((i+1) + "." + ContactList.get(i).getName() + " -> " + ContactList.get(i).getTel());
        }
    }
    public void RemoveContact(){
        System.out.println("Contact List");
        for (int i = 0; i < ContactList.size(); i++) {
            System.out.println((i+1) + "." + ContactList.get(i).getName() + " -> " + ContactList.get(i).getTel());
        }
        System.out.println("Enter name and phone number you want to delete");
        System.out.print("Name: ");
        //sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Phone number: ");
        String tel = sc.nextLine();
        //sc.nextLine();
        int count = 0;
        for (int i = 0; i < ContactList.size(); i++) {
            if(name.compareTo(ContactList.get(i).getName()) == 0 &&  tel.compareTo(ContactList.get(i).getTel()) == 0){
                //String nameRemove = name;
                ContactList.remove(i);
                count++;
                System.out.println( name + " was deleted.");
                System.out.println("Successfully deleted");
            }
        }
        if(count == 0 ){
            System.out.println("There is not contact you want to delete");
           //System.out.print("Do you want to try again?");
        }
    }
    public void SearchContact(){
        System.out.println("Enter name you want to search");
        System.out.print("Name: ");
        //sc.nextLine();
        String name = sc.nextLine();
        int count = 0;
        for (int i = 0; i < ContactList.size(); i++) {
            if(name.compareTo(ContactList.get(i).getName()) == 0){
                System.out.println("Name: " + ContactList.get(i).getName() + " phone number is " + ContactList.get(i).getTel());
                count++;
            }
        }
        if(count == 0 ){
            System.out.println("There is not contact you want to search");
           //System.out.print("Do you want to try again?");
        
    }
    }
//    public static void main(String[] args) {
//        ContactListContactList a = new ContactListContactList();
//        a.AddContact();
//        a.UpdateContact();
//        a.RemoveContact();
//    }
}
