package restaurent;
import java.util.Scanner;
public class  menu {
 Scanner input=new Scanner(System.in);
 String []menu={"hamburger","cheeseburger","chicken","salad","fries"};
 void menuR(){

for(int i=0;i<menu.length;i++){
   


   System.out.print(i+")");
   System.out.println(menu[i]); 

}

 }
        
    
}
