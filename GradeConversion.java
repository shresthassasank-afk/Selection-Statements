import java.util.Scanner;
public class GradeConversion{
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the gpa");
     double gpa=sc.nextDouble();
     if(gpa>3.60 && gpa<=4.00){
         System.out.println("The grade obtained is A+");
     }
     else if(gpa>=3.00 && gpa<3.60){
         System.out.println("The grade obtained is A");
     }
     else if(gpa>=2.60 && gpa<3.00){
         System.out.println("The grade obtained is B+");
     }
     else if(gpa>=2.00 && gpa<2.60){
         System.out.println("The grade obtained is B");
     }
    else if(gpa>=1.60 && gpa<2.00){
        System.out.println("The grade obtained is C+");
    }
    else{
        System.out.println("The grade is fail(f)");
    }
} 
    
}