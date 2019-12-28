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
public class Calculator {
    
    public static Scanner sc = new Scanner(System.in);
    public static int[] initArray(int size){
        int arr[] = new int[size];
        System.out.println("Nhập giá trị cho mang : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    public static double getArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double tb = (double)sum/array.length;
        return tb;
    }
    public static void main(String[] args) {
        int myArray[] = initArray(5);
        System.out.println("Mạng vừa nhập là : ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.print("Giá trị trung bình của mạng vừa nhập là : " +getArray(myArray));
    }
}
