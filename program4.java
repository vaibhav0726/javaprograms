import java.util.Scanner;
class AreaOfCircle 
{
   public static void main(String args[]) 
    {     
      Scanner obj = new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         double r= obj.nextDouble();
         double  area=(22*r*r)/7 ;
         System.out.println("Area of Circle is: " + area);      
   }
}