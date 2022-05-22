package Task2;
import java.util.Scanner ;
import java.util.ArrayList ;

public class MaxRowColumn {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter array size : ");
		int size = input.nextInt();
		
		int [][] array = new int [size][size]; 
		array = inputArray(array);
		printArray(array);
		
		ArrayList<Integer> row = new ArrayList<>(); 
		ArrayList<Integer> column = new ArrayList<>();
		
		maxRow(array,row);
		maxColumn(array,column);
		
		System.out.println("Row with most 1 : " +row.toString());
		System.out.println("Column with most 1 : " +column.toString());
		
	}
	
	public static int [][] inputArray(int [][] array) {
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < array[i].length ; j++) {
				array[i][j] = (int)(Math.random() * 2) ;
			}
		} 
		return array ;
	}
	public static void printArray(int [][] array) {
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < array[i].length ; j++) {
				System.out.print(array[i][j] +" ") ;
			} 
			System.out.println();
		}
	}
	public static void maxRow(int[][] arr , ArrayList<Integer> row) {
		int max = 0 ; 
		for(int i = 0 ; i < arr.length ; i++) {
			int count = 0 ; 
			
			for(int j = 0 ; j < arr[i].length ; j++) {
				if(arr[i][j] == 1) {
					count++ ;
				}
				if(count > max) {
					max = count ; 
					row.clear(); // if true then clear the array then add
					row.add(i);
 				}
				else if(count == max) {
					row.add(i);
				}
			} 
		}
	}
	
	public static void maxColumn(int[][] arr , ArrayList<Integer> column) {
		int max = 0 ; 
		for(int i = 0 ; i < arr[0].length ; i++) {
			int count = 0 ; 
			
			for(int j = 0 ; j < arr.length ; j++) {
				if(arr[j][i] == 1) {
					count++ ;
				}
				if(count > max) {
					max = count ; 
					column.clear(); // if true then clear the array then add
					column.add(j);
 				}
				else if(count == max) {
					column.add(j);
				}
			} 
		}
	}

}
