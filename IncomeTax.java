
import java.util.Scanner;
public class IncomeTax
{
   public static void main(String[] args){ 
       Scanner sc=new Scanner(System.in);
       double tax=0;
       System.out.println("enter the income");
       double income=sc.nextDouble();
       if(income<=500000){
           tax=(0.01*income);
           System.out.println("The tax amount ="+tax);
       }
       else if(income<=700000 && income>=500001){
           tax=(5000+0.1*(income-500000));
           System.out.println("The tax amount ="+tax);
       }
       else if(income<=1000000 && income>=700001){
           tax=(15000+0.2*(income-700000));
           System.out.println("The tax amount ="+tax);
       }
       else if(income<=2000000 && income>=1000001){
           tax=(35000+0.3*(income-1000000));
           System.out.println("The tax amount="+tax);
       }
       else if(income<=5000000 && income>=2000001){
           tax=(335000+0.36*(income-2000000));
            System.out.println("The tax amount="+tax);   
           
       }
       else if(income>5000000){
           tax=(1135000+0.39*(income-5000000));
           System.out.println("The tax amount="+tax);
           
       }
       
   }
}