package File;
import java.util.*;
import java.io.*;

public class CountTest {
	public static void main(String[] args) throws IOException {
		
		if(args.length < 1) {
			System.out.println("Can't find.");
			System.exit(1);
		}
		File file = new File(args[0]);
		if(!file.exists()) {
			System.out.println("File  "+args[0]+ " doesn't exists.");
			System.exit(2);
		}
		int lines = 0;
		int  words = 0;
		int characters = 0;
		
		try {
			Scanner input = new Scanner(file);
			while(input.hasNext()) {
				String line = input.nextLine();
				lines++;
				characters+= line.length();
				String[] word = line.split(" ");
				words+= word.length;
			}
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Total characters : " +characters);
		System.out.println("Total words : " +words);
		System.out.println("Total lines : " +lines);

	}

}
