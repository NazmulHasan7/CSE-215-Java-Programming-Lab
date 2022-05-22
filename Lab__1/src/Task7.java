
import java.util.Scanner;
public class Task7 {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of water in  Kg : ");
        
        double amount = input.nextDouble();
        System.out.print("Enter initial and final temperature : ");

        double initialtemp = input.nextDouble();
        double finalTemp = input.nextDouble();
        double energy = amount*(finalTemp-initialtemp)*4184;
        System.out.println("Total Energy : "+energy);
   }
}
