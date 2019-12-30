/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nhat Hoang
 */
class Student{
    private int id;
    private String name;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }
    
}
public class ArrayList_DoNguoiDungDinhNghia {
    public static final int NUM_OF_ELEMENT = 5;
    public static void main(String[] args) {
        // Create list with compacity = 3
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= NUM_OF_ELEMENT; i++) {
            // Add element to list
            Student student = new Student(i, " my name " +i);
            students.add(student);
        }
        for(Student a : students){
            System.out.println(a);
        }
        students.forEach((student) -> {
            System.out.println(student);
        });
        
    }
}
