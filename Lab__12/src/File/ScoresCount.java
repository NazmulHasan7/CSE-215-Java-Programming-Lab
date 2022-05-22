package File;
import java.util.*;
import java.io.*;

public class ScoresCount {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a file loctaion with scores : ");
		File file = new File(input.nextLine());
		
		if(!file.exists()) {
			System.out.println("File not found");
			System.exit(1);
		}
		if(file.exists()) {
			System.out.println("file opened.");
		}
		double score = 0;
		double  average = 0;
		int count = 0 ;
		
		try(Scanner inputFile = new Scanner(file)) {
			while(inputFile.hasNext()) {
				System.out.println("IN FILE " +inputFile.nextInt());
				score+= inputFile.nextInt();
				count++;
			}
		}
		catch(Exception ex) {
			System.out.println("File not found.");
		}
		System.out.println("Total is : " +score);
		System.out.println("Average is : " +score/count);

	}

}
