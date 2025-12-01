import java.util.Scanner;
public class SpCalculator
{
   public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the marked price");
       double mp=sc.nextInt();
       sc.nextLine();
       System.out.println("enter the category");
       String category=sc.nextLine();
       double dis=0;
       double finalprice=0;
       switch(category){
           case "A":
              dis=(0.60*mp);
              finalprice=(mp-dis);
              System.out.println("The final price =" +finalprice);
              break;
           case "B":
              dis=(0.40*mp);
              finalprice=(mp-dis);
              System.out.println("The final price=" +finalprice);
              break;
           case "C":
              dis=(0.20*mp);
              finalprice=(mp-dis);
              System.out.println("the final price=" +finalprice);
              break;
           case "D":
              dis=(0.10*mp);
              finalprice=(mp-dis);
              System.out.println("The final price=" +finalprice); 
              break;
              default:
                System.out.println("invalid category");
        }
       
           
               
           
       
       
       
   }
}