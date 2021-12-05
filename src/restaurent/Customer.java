package restaurent;
import java.util.Scanner;
public class Customer{
Scanner input=new Scanner(System.in);
String name,gender;
 int id,phone;
 
 Customer(String n,String g,int i,int p){
 name=n;
 gender=g;
 id=i;
 phone=p;
}  
 
  public void PrintCustomerInfo(){
      System.out.println("Customer Name:"+name);
      System.out.println("Customer Gender:"+gender);
      System.out.println("Customer Order ID:"+id);
      System.out.print("Customer Phone Number:"+phone);
      
  }
 
   
}