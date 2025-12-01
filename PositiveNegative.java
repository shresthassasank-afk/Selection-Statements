
import java.util.Scanner;
public class PositiveNegative
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();
        if(num<0){
            System.out.println("The num is negative");
        }
        else if(num>=0){
            System.out.println("The num is positive");      
        }
        else if(num==0){
            System.out.println("The num is zero");       
        }
        
    }
        
    
}