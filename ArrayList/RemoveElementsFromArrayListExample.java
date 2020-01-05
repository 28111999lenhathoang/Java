/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuhocbuoi6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Nhat Hoang
 */
/*
1.Cách xóa bỏ phần tử tại một chỉ mục đã cho trong ArrayList   remove(int index)
2.Cách xóa bỏ phần tử trong ArrayList bằng remove(object o)
3.Cách xóa tất cả các thành phần khỏi ArrayList tồn tại trong bộ sưu tập đã cho 
bằng removeAll()
4.Làm thế nào để loại bỏ tất cả các yếu tố phù hợp với một vị trí từ nhất định
removeIf()
5.Làm thế nào để xóa một ArrayList
*/
public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programingLanguages = new ArrayList<>();
        programingLanguages.add("C");
        programingLanguages.add("C++");
        programingLanguages.add("Java");
        programingLanguages.add("PHP");
        programingLanguages.add("Ruby");
        System.out.println(programingLanguages);
        // remove the eplement at index '3'
        programingLanguages.remove(3);
        System.out.println("list after remove : " +programingLanguages);
        // remove the first occurrence of the given element from the arraylist
        //the remove() method returns false if the element does not exist in the arraylist
        boolean isRemoved = programingLanguages.remove("Java");
        System.out.println("After remove (\"java\"):"+programingLanguages);
        // remove all the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        programingLanguages.add("PHP");
        programingLanguages.add("Perl");
        programingLanguages.add("C++");
        scriptingLanguages.add("C++");
        scriptingLanguages.add("Phthon");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");
        programingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages):"+programingLanguages);
        System.out.println(scriptingLanguages);
        // Remove all the elements that satisfy the given predicate
        programingLanguages.removeIf(new Predicate<String>(){
        public boolean test(String s){
            return s.startsWith("C");
        }
        });
        /*
        the above removeIf() call can alse be written using lambda expression
        like this - programingLanguages.removeIf(s -> startsWith("C"))
        */
        //System.out.println("After Removing all elements that start with \"C\" : " +programingLanguages);
        // Remove All elements from  the arraylist
        programingLanguages.clear();
        System.out.println("After clear : " +programingLanguages);
        
    }
}
