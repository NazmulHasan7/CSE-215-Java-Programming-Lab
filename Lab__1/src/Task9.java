
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
  
      Scanner input = new Scanner (System.in);
      System.out.print("Enter weight in pounds : ");
  
      double weight = input.nextDouble();
      weight *= 0.45359;
      System.out.print("Enter height in Centemeter : ");

      double height = input.nextDouble();
      height*= 0.0254;
      double BMI = weight /(height*height);
      System.out.print("BMI is : " +BMI);
   }
}