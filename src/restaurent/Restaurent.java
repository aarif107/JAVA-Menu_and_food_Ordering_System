package restaurent;

import java.util.Scanner;

public class Restaurent {
 public static void main(String[] args) {
     
System.out.println("*****Aaryan Aarif Restaurent*****"); 
    System.out.println();
    System.out.println("Menu For Fast Food");
/*menu m=new menu();     
m.menuR();*/
OrderPrice op=new OrderPrice();
op.menuR();
op.cus_order();
op.cal_price();
    System.out.println();
    System.out.println("Menu for Cold Drinks");
    /*DrinkMenu dm=new DrinkMenu();
    dm.drink_menu();*/
    DrinkPrice dp=new DrinkPrice();
   dp.drink_menu();
   dp.drink_order();
   dp.drink_price();
     System.out.println();
     
     System.out.println("Enter for Customer Information");
     
        Scanner input =new Scanner(System.in);
     System.out.print("Enter Customer Name:");
    String name=input.nextLine();
    System.out.print("Enter Customer gender:");
    String gender=input.nextLine();
    System.out.print("Enter Customer Order Id:");
    int id=input.nextInt();
    System.out.print("Enter Customer Phone:");
    int phone=input.nextInt();
    
     Customer c=new Customer(name,gender,id,phone);
     c.PrintCustomerInfo();
    }
}