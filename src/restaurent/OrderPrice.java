package restaurent;
import java.util.Scanner;
public class OrderPrice extends menu {
    
double price=0;
double ham=300;
double cheese=180;
double chick=150;
double salad=200;
double fries=90;
int amount;
int c;
void cus_order(){
    Scanner input=new Scanner(System.in);
  
System.out.println("Please select an item");
c=input.nextInt();
while(c<0 || c>4){
   System.out.println(c+ " is an invalid selection. Please enter your choice again");
   c=input.nextInt(); 
} 
System.out.println("you ordered a "+menu[c]);
System.out.println("how many "+menu[c]+" would you like");
   
}
void cal_price(){
    amount=input.nextInt();
System.out.println(amount);
switch(c){
   
   case(0):
   price=ham*amount;
   break;
   
   case(1):
   price=cheese*amount;
   break;
   
   case(2):
   price=chick*amount;
   break;
   
   case(3):
   price=salad*amount;
   break;
   
   case(4):
   price=fries*amount;
   break;
   
 
}
    
 System.out.println("Would you like anything else y/n. Please enter a y for yes and a n for No");

String ans=input.next();

while(ans.equals("y")){
   System.out.println("please select an item");
   c=input.nextInt();
   
   System.out.println("how many "+menu[c]+ "do you want");
   amount=input.nextInt();
      System.out.println(amount);
   
   switch(c){
   
   case(0):
   price=ham*amount+price;
   break;
   
   case(1):
   price=cheese*amount+price;
   break;
   
   case(2):
   price=chick*amount+price;
   break;
   
   case(3):
   price=salad*amount+price;
   break;
   
   case(4):
   price=fries*amount+price;
   break;
   
   
   
 
}
 System.out.println("Anything else y/n");
 ans=input.next(); 
    
}

System.out.println("your total Bill is BDT:"+price);
}
    
}
