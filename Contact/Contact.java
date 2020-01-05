/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contact;

/**
 *
 * @author Nhat Hoang
 */

public class Contact {
    String name;
    String tel;
    public Contact(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
    public String getName(){
        return name;
    }
    public  void setName(String name){
        this.name = name;
    }
    public String getTel(){
        return tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", tel=" + tel + '}';
    }
    
}
