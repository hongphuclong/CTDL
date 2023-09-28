package Lab1;

import java.util.Arrays;

public class Task1 {
	private int[] array;

	public Task1(int[] array) {
		this.array = array;
	}
	//Method mirror that outputs the contents of an array in a 
	//reverse order like a mirror 
	//Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]
	public int[] mirror() {
		int[] result = new int[array.length*2];
		for (int i = 0; i < array.length; i++) {
			result[i]=array[i];
			result[result.length-1-i]=array[i];
		}
		return result;
	}
	public static int count(int[] array,int n) {
		int count =0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==n) {
				count++;
			}
		}
		return count;
	}
	// removes all duplicate elements from an array and returns a 
	// new array
	//Input: 1 3 5 1 3 7 9 8
	//Output: 1 3 5 7 9 8
	public int[] removeDuplicates() {
		int[] result = new int[array.length];
		int j =0;
		for (int i = 0; i < array.length; i++) {
			if(!(isDuplicated(array, i))) {
				result[j]=array[i];
				j++;
			}
		}
		return new Task1(result).getUniqueElements();
	}
	public int[] getUniqueElements() {
		int count =0;
		for (int i = 0; i < array.length; i++) {
			if(count(array,array[i])==1) {
				count++;
			}
		}
		int[] result = new int[count];
		int j =0;
		for (int i = 0; i < array.length; i++) {
			if(count(array,array[i])==1) {
				result[j]=array[i];
				j++;
			}
		}
		return result;
	}
	public static boolean isDuplicated(int[] array,int index) {
		boolean result = false;
		for (int i = index; i>0; i--) {
			if(array[index]==array[i-1]) {
				result=true;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		int[] array= {1,2,3};
		int[] array1= {12, 10, 9, 45, 2, 10, 10, 45};
		int[] array2= {1, 3, 5, 1, 3, 7, 9, 8};

		Task1 a = new Task1(array1);
		Task1 b = new Task1(array);
		Task1 c = new Task1(array2);
		
		System.out.println(Arrays.toString(b.mirror()));
		System.out.println(Arrays.toString(a.removeDuplicates()));
//		System.out.println(Arrays.toString(c.removeDuplicates()));

	}
}	