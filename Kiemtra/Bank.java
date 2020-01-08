/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtra;

import java.util.Scanner;

/**
 *
 * @author Nhat Hoang
 */
public class Bank {
   double balance;
   double rate;
   public Bank(double balance, double rate){
       this.balance = balance;
       this.rate = rate;
   }
   public double calculateInterest(){
       double interest = balance*(rate/1200);
       return interest;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance;
        double rate;
        System.out.print("balance : ");
        balance = sc.nextDouble();
        System.out.print("rate : ");
        rate = sc.nextDouble();
        Bank x = new Bank(balance, rate);
        System.out.println("Calculate = " +x.calculateInterest());
    }
}
