/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contact;

import java.util.Scanner;



/**
 *
 * @author Nhat Hoang
 */
public class MainContact {
    public static void main(String[] args) {
        ContactList x = new ContactList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting phone...");
        System.out.println();
        int choose;
        do{
            System.out.println("\nAvailable actions:");
            System.out.println("please press:\n");
            System.out.println("0 - to shutdown\n");
            System.out.println("1 - to print contacts\n");
            System.out.println("2 - to add new contacts\n");
            System.out.println("3 - to update many existing contacts\n");
            System.out.println("4 - to remove many existing contacts\n");
            System.out.println("5 - query if an existing contact exists\n");
//            System.out.println("6 - to print a list of available actions.\n");
            System.out.print("Choose your action: ");
//            System.out.print("Enter actions: (6 to show available actions)\n");
            choose = sc.nextInt();
            switch(choose){
                case 0: System.out.println("\nShutting down...");
                        break;
                case 1: x.ShowList();
                        break;
                case 2: x.AddContact();
                        break;
                case 3: x.UpdateContact();
                        break;
                case 4: x.RemoveContact();
                        break;
                case 5: x.SearchContact();
                        break;
//                case 6: System.out.println("Available actions:\n");
//                        System.out.println("please press:\n");
//                        System.out.println("0 - to shutdown\n");
//                        System.out.println("1 - to print contacts\n");
//                        System.out.println("2 - to add new contacts\n");
//                        System.out.println("3 - to update many existing contacts\n");
//                        System.out.println("4 - to remove many existing contacts\n");
//                        System.out.println("5 - query if an existing contact exists\n");
//                        System.out.println("6 - to print a list of available actions.\n");
//                        System.out.println("Choose your action: \n");
//                        System.out.println("Enter actions: (6 to show available actions)");
//                        break;
                default:System.out.println("\nChoose again\n");
                        System.out.println("--- --- ---\n");
                        break;
            }
        }while(choose!= 0);
    }
}
