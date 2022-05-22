
import java.util.Scanner ;
public class Task5 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Celcius temperature : ");

    double celcius = input.nextDouble();
    double fahrenheit = (9/5.0)*celcius + 32;    
    System.out.println("Fahrenheit temperature is : "+fahrenheit);
   
   }
}