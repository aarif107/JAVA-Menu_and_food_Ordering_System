package restaurent;
import java.util.Scanner;
public class DrinkPrice extends DrinkMenu{
 double price=0;
double Cocacola=80;
double Mountain_Dew=80;
double Pepsi=80;
double Water=20;
double Red_Bull=200;
int amount;
int c;
void drink_order(){
    Scanner input=new Scanner(System.in);
  
System.out.println("Please select an item");
c=input.nextInt();
while(c<0 || c>4){
   System.out.println(c+ " is an invalid selection. Please enter your choice again");
   c=input.nextInt(); 
} 
System.out.println("you ordered a "+drink[c]);
System.out.println("how many "+drink[c]+" would you like");
   
}
void drink_price(){
    amount=input.nextInt();
System.out.println(amount);
switch(c){
   
   case(0):
   price=Cocacola*amount;
   break;
   
   case(1):
   price=Mountain_Dew*amount;
   break;
   
   case(2):
   price=Pepsi*amount;
   break;
   
   case(3):
   price=Water*amount;
   break;
   
   case(4):
   price=Red_Bull*amount;
   break;
   
 
}
    
 System.out.println("Would you like anything else y/n. Please enter a y for yes and a n for n");

String ans=input.next();

while(ans.equals("y")){
   System.out.println("please select an item");
   c=input.nextInt();
   
   System.out.println("how many "+drink[c]+ "do you want");
   amount=input.nextInt();
      System.out.println(amount);
   
   switch(c){
   
   case(0):
   price=Cocacola*amount+price;
   break;
   
   case(1):
   price=Mountain_Dew*amount+price;
   break;
   
   case(2):
   price=Pepsi*amount+price;
   break;
   
   case(3):
   price=Water*amount+price;
   break;
   
   case(4):
   price=Red_Bull*amount+price;
   break;
   
   
   
 
}
 System.out.println("Anything else y/n");
 ans=input.next(); 
    
}

System.out.println("your total Bill is BDT:"+price);   
}
}