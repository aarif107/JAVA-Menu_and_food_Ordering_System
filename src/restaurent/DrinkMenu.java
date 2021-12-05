package restaurent;
import java.util.Scanner;
public class DrinkMenu {
    Scanner input=new Scanner(System.in);
 String []drink={"Cocacola","Mountain Dew","Pepsi","Water","Red Bull"};
 void drink_menu(){
  for(int i=0;i<drink.length;i++){
   
System.out.print(i+")");
   System.out.println(drink[i]); 

}
}

 
}
