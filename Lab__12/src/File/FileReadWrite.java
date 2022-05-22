package File;
import java.util.*;
import java.io.*;

public class FileReadWrite {
	public static void main(String[] args) throws IOException {
		
		File file = new File("Exercise12_15.txt");
		
		if(!file.exists()) {
		file.createNewFile();
		}
		else
			System.out.println("file already exists");
//WRITING		
		try(PrintWriter output = new PrintWriter(file)){
			for(int i = 0; i <100 ; i++) {
				int ran = (int)(Math.random()* 100);
				output.print(ran);
				output.print(" ");
			}
			output.close();
		}
//READING
		ArrayList<Integer> list = new ArrayList<>();
		try(Scanner input = new Scanner(file)){
			while(input.hasNext()) {
				list.add(input.nextInt());
			}
		}
		java.util.Collections.sort(list);
		System.out.println("Sorted List : " +list.toString());

	}

}
