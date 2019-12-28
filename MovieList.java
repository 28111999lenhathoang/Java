/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nhat Hoang
 */
public class MovieList {
    public static void main(String[] args) {
        // Add movie
        List<String> MovieList = new ArrayList<>();
        MovieList.add("Tây du ký");
        MovieList.add("Hồng Hài Nhi");
        MovieList.add("Mắt biếc");
        MovieList.add("Điều đặc biệt ở phòng giam số 7");
        // Print list movie
        System.out.println("List movie : " +MovieList);
        // fix name movie
        MovieList.set(1,"Thần điêu đại hiệp");
        System.out.println("List movie after fix : " +MovieList);
        // Delete movie from list movie
        MovieList.remove(2);
        System.out.println("List movie after delete : " +MovieList);
        //Search name movie from list movie
        System.out.println("Is Tây du ký on the list movie ?" +MovieList.contains("Tây du ký"));
    }
}
