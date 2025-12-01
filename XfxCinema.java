
import java.util.Scanner;
public class XfxCinema
{
    public static void main(String[] args){
        double baseprice=0.00;
        double baseprice1=0.00;
        double finalprice=0.00;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age group");
        String agegroup=sc.nextLine();
        if(agegroup.equals("Child")){
            baseprice=150;       
        }
        else if(agegroup.equals("Adult")){
            baseprice=250;
        }
        else if(agegroup.equals("Senior")){
            baseprice=200;
        }
        else{
            System.out.println("Invalid age group");
        }
        System.out.println("enter the movie language");
        String language=sc.nextLine();
        if(language.equals("English")){
            baseprice+=100;
        }
        else if(language.equals("Hindi")){
            baseprice+=50;
        }
        else{
            System.out.println("Invalid language");
        }
        System.out.println("are you a student");
        String student=sc.nextLine();
        if(student.equals("yes")){
            baseprice1=(baseprice-0.2*baseprice);
        }
        else if(student.equals("no")){
            baseprice1=baseprice;
        }
        else{
            System.out.print("Invalid response");
        }
        System.out.print("Is there a festival");
        String festival=sc.nextLine();
        if(festival.equals("yes")){
             finalprice=(baseprice1-0.15*baseprice1);
            
        }
        else if(festival.equals("no")){
            finalprice=baseprice1;
        }
        else{
            System.out.print("Invalid response");
        }
        System.out.println("============================");
        System.out.println("\tticket price");
        System.out.println("============================");
        System.out.println("The final price="+finalprice);
        
        
    }
}