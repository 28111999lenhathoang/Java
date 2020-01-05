/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nhat Hoang
 */
/*
--Tìm và hiện thị phần tử lớn nhất trong 1 ArrayList  
    Viết chương trình nhập vào các phần tử cho 1 ArrayList từ bàn phím. Sau đó tìm và hiện thị phần tử lớn nhất, bé nhất trong ArrayList đó
 */
public class MaxMininArrayList {
public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        List<Integer> arraylist = new ArrayList<>();
        System.out.println("Nhập số phần tử của mạng :");
        n = sc.nextInt();
        int number;
        System.out.println("Nhập phần tử cho mạng arrlist : ");
        for (int i = 0; i < n; i++) {
            number = sc.nextInt();
            arraylist.add(number);
        }
        System.out.println(arraylist);
        int max = arraylist.get(0);
        int min = arraylist.get(0);
        for (int i = 0; i < arraylist.size() ; i++) {
            if(max < arraylist.get(i)){
                max = arraylist.get(i);
            }
        }
        for (int i = 0; i < arraylist.size(); i++) {
            if(min > arraylist.get(i)){
                min = arraylist.get(i);
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng arrlist là : " +max);
        System.out.println("Phần tử bé nhất trong mảng arrlist là : " +min);
    }
}
