package Lab2;

import java.util.Arrays;

public class Task3 {
	public static int[] generateNextRow(int[] prevRow) {
		int[] result = new int[prevRow.length+1] ;
		for(int i =0 ; i < result.length ; i++) {
			if(i==0 || i== result.length -1) {
				result[i] =1 ;

			}else {
				result[i] = prevRow[i-1] + prevRow[i];
			}
		}
		return result;
	}
	public static int[] getPascalTriangle(int n) {
		int[] arr = {1};
		if(n==1) {
			return arr;
		}else {
			return generateNextRow(getPascalTriangle(n-1));

		}
	}
	public static void printPascalTriangle(int row) {
		for(int i=0 ; i < getPascalTriangle(row).length; i++) {
			System.out.print(getPascalTriangle(row)[i] + "  ");
		}
	}
	public static void main(String[] args) {
		Task3 task3 = new Task3();
		int[] prevRow = {1,2,3};
		System.out.println(Arrays.toString(task3.generateNextRow(prevRow)));
		System.out.println(Arrays.toString(task3.getPascalTriangle(5)));
		task3.printPascalTriangle(5);
	}
}
