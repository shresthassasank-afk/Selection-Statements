

import java.util.Scanner;
public class Switch
{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the day");
       String day=sc.nextLine();
       switch(day){
           case "sunday":
               System.out.println("first class hardware and sec class programming");
               break;
           case "monday":
               System.out.println("first class programming and sec class IS");
               break;
           case "tuesday":
               System.out.println("first class tutorial and sec class workshop ");
               break;
           case "wednesday":
               System.out.println("first class tutorial and sec class workshop");
               break;
           case"thursday":
               System.out.println("first class tutorial and sec class workshop");
               break;
           case "friday":
               System.out.println("first class tutorial and sec class workshop");
               break;
           case"saturday":
            System.out.println("holiday");
            break;
       }
    }
        
        
        
        
        
    
}