
import java.util.Scanner ;

public class Task3 {
   public static void main(String[] args) {
  
      final double PI = 3.1416;
      double radius , area ;
      
      Scanner input = new Scanner (System.in);
      System.out.print("Enter radius : ");
      radius = input.nextDouble();
      
      if(radius>=0) {
            area = PI * radius * radius ;
            System.out.println("Area is "+area);
      }
      else 
        System.out.println("Wrong input.");
    }
}