  
package ASM2;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodList {
    private ArrayList<FoodMenu> foodLists;
    private ArrayList<Order> orderslist;


    public FoodList() {
        this.foodLists = new ArrayList<FoodMenu>();
        this.orderslist = new ArrayList<Order>();
    }

    public void setMenu() {
        // tao ra danh sach cac mon an
        foodLists.add(new FoodMenu("coca", 100000));
        foodLists.add(new FoodMenu("pepsi", 15000));
        foodLists.add(new FoodMenu("kfc", 25000));
        foodLists.add(new FoodMenu("banhmi", 45000));
        foodLists.add(new FoodMenu("trasua", 45000));
        foodLists.add(new FoodMenu("bun", 45000));
        foodLists.add(new FoodMenu("pho", 45000));
    }

    public void showMenu() {
        // show danh sach mon an
        System.out.println("Food Menu: ");
        for (int i = 0; i < foodLists.size(); i++) {
            System.out.print((i + 1)+". ");
            System.out.println("FoodName: " + foodLists.get(i).getFoodName() + "\nPrice: " + foodLists.get(i).getFoodPrice());
        }
    }

    public boolean oderFood() {
        String fName; // ten mon an
        int fAmount; // luu tru so luong cua mon an
        int Total = 0;
        // nhap vao
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Food Name to Order: ");
        fName = sc.nextLine();
        System.out.println("Enter Amount : ");
        fAmount = sc.nextInt();
        for (int i = 0; i < foodLists.size(); i++) {
            FoodMenu foodMenu = foodLists.get(i);
            if (foodMenu.getFoodName().equals(fName)) {
                fName = foodLists.get(i).getFoodName();
                System.out.println("Food is Already To Order!");
                // tinh tong tien
                Total = fAmount * foodLists.get(i).getFoodPrice();
                orderslist.add(new Order(fName, fAmount, Total));
                return true;
            }
        }
        System.out.println("Food is not available in the Menu!");
        return false;
    }

    public void showOrder() {
        int sumTotal = 0; // bien luu tru tong tien toan do hoa don

        for (int i = 0; i < orderslist.size(); i++) {
            sumTotal += orderslist.get(i).getTotalPrice();
            System.out.println("Order Food List : ");
            System.out.print((i + 1)+". ");
            System.out.println("FoodName: " + orderslist.get(i).getFoodName() + "\nAmount" + orderslist.get(i).getFoodAmount());
        }
        System.out.println("Total Price" + sumTotal);
    }
    public boolean removeOrder() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter food to remove in order list: ");
        name = sc.nextLine();
        for (int i = 0; i < orderslist.size(); i++) {
            Order order = orderslist.get(i);
            if (order.getFoodName().equals(name)) {
                orderslist.remove(i);
                System.out.println(order.getFoodName()+"was successful remove in the order list!");
                return true;
            }
        }
        System.out.println("Food are not on the order list");
        return false;
    }

    public boolean changeAmount() {
        int Amount;
        int newTotal = 0;
        String fName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter food name to change the amount: ");
        fName = sc.nextLine();
        System.out.println("Enter amount: ");
        Amount = sc.nextInt();

        for(int i=0;i<foodLists.size();i++) {
            FoodMenu menu = foodLists.get(i);
            if (menu.getFoodName().equals(fName)) {
                // tong tien moi sau khi thay doi amount
                newTotal = Amount * foodLists.get(i).getFoodPrice();
            }
        }
        for (int i = 0; i < orderslist.size(); i++) {
            Order order = orderslist.get(i);
            if (order.getFoodName().equals(fName)) {
                orderslist.get(i).setFoodAmount(Amount);
                orderslist.get(i).setTotalPrice(newTotal);
                System.out.println("Successful change amount : "+order.getFoodName()+"to: "+order.getFoodAmount());
                return true;
            }
        }
        System.out.println("Food not in the list");
        return false;
    }
}