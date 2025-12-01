

import java.util.Scanner;
public class ScholarshipEligiblity
{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the GPA");
       double gpa=sc.nextDouble();
       System.out.println("Enter the Attendence");
       double Attendence=sc.nextDouble();
       System.out.println("Enter the Attitude score");
       double Attitude=sc.nextDouble();
       if(gpa>=3.2){ 
           if(Attendence>80){
               if(Attitude<5){
                   System.out.println("You are eligible for scholarship");
               }else{
                   System.out.println("you are not eligible for scholarship");
               }
           }else{
               System.out.println("you are not eligible for scholarship");
           }
       }else{
            System.out.println("you are not eligible for scholarship");
       }
        }
    }          
