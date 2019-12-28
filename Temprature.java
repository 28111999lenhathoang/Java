/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Array;

import java.util.Scanner;

/**
 *
 * @author Nhat Hoang
 */
public class Temprature {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số ngày n : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập nhiệt độ của ngày " +(i+1) +" : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double tb = (double)sum/n;
        int count = 0;
        System.out.println("Nhiệt độ trung bình của " +n+ " ngày là : " +tb);
        for (int i = 0; i < n; i++) {
            if(arr[i] > tb){
                count++;
            }
        }
        System.out.println("Có " +count+ " ngày cao hơn nhiệt độ trung bình " +tb);
    }
}
