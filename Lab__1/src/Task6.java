
import java.util.Scanner ;
public class Task6 {
   public static void main(String[] args) {
  
      Scanner input = new Scanner(System.in);
      System.out.print("Enter subtotal and Gratuity rate : ");
  
      double subtotal = input.nextDouble();
      double rate = input.nextDouble();
        
   
      rate = subtotal*rate/100;
      double total = subtotal + rate ;
      System.out.println("Gratuity is "+rate+" and Total is "+total);
   }
}
