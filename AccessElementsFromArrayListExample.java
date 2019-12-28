/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuhocbuoi6;

/**
 *
 * @author Nhat Hoang
 */
/*
-Làm thế nào để kiểm tra nếu ArrayList trống bằng cách sử dụng isEmpty()
-Cách truy tìm kích thước của một mạng ArrayList bằng size()
-Cách truy cập phần tử tại một chỉ mục cụ thể trong ArrayList bằng get()
-Cách sửa đổi phần tử tại một chỉ mục cụ thể trong ArrayList bằng set()
*/
import java.util.ArrayList;
import java.util.List;
public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        // kiểm tra ArrayList có trống hay không
        System.out.println("Is the topCompanies list empty ? " +topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Samsung");
        topCompanies.add("Facebook"); 
        // Find the size of the ArrayList
        System.out.println("Here are the top " + topCompanies.size() +" companies in the wolrd");
        System.out.println(topCompanies);
        // Truy cập từng phần tử của ArrayList bằng get()
        String bestCompanies = topCompanies.get(0);
        String secondCompanies = topCompanies.get(1);
        String lastCompanies = topCompanies.get(topCompanies.size()-1);
        System.out.println("BestCompanies in the wolrd : " +bestCompanies);
        System.out.println("SecondCompanies in the wolrd : " +secondCompanies);
        System.out.println("LastCompanies in the list : " +lastCompanies);
        topCompanies.set(3,"Vinfast");
        System.out.println(topCompanies);
    }
 
}
