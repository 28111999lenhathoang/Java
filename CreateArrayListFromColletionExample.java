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
Cách tạo ArrayList từ một bộ sưu tập khác bằng cách dùng hàm ArrayList(collection c)
Cách thêm tất cả các phần tử từ một bộ sưu tập hiện có vào ArrayList mới
bằng addAll()
*/
import java.util.ArrayList;
import java.util.List;
public class CreateArrayListFromColletionExample {
    public static void main(String[] args) {
        /*
        Creating an ArrayList
        */
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(4);
        firstFivePrimeNumbers.add(6);
        firstFivePrimeNumbers.add(8);
        firstFivePrimeNumbers.add(1);
        /*
        Creatin an ArrayList from another collection
        */
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.addAll(nextFivePrimeNumbers);
        nextFivePrimeNumbers.add(22);
        nextFivePrimeNumbers.add(21);
        nextFivePrimeNumbers.add(11);
        nextFivePrimeNumbers.add(14);
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);
        System.out.println(firstFivePrimeNumbers);
    }
}
