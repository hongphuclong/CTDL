package Lab3;

import java.util.Arrays;

public class MyArray {
	private int [] array;
	public MyArray(int[]array) {
		this.array = array;
	}
	// To find the index of the target in the array. If the target 
	// is not found
	// in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
	// Output: 3
	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) 
				return i;			
		}
		return -1;
	}
	// To find the index of the target in the array. If the target 
	// is not found
	// in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
	// Output: -1
	public int recursiveLinearSearch(int size, int target) {
		if (size == 0)
			return -1;
		else if (array[size-1] == target)
			return size-1;
		else {
			return recursiveLinearSearch(size-1,target);
		}	
	}
	// To find the index of the target in the sorted array. If the 
	// found in the array, then the method returns -1.
	public int iterativeBinarySearch(int target) {
		int low =0;
		int high= array.length-1;
		while (low <= high) {
			int mid = (low + high) /2;
			if (target == array[mid])
				return mid;
			else if (target < array[mid])
				high = mid -1;
			else low = mid + 1;
		}
		return -1;
	}
	// To find the index of the target in the sorted array. If the 
	//target is not
	// found in the array, then the method returns -1.
	public int recursiveBinarySearch(int target,int low, int high) {
		if (low <= high) {
			int mid = (low + high)/2;
			if (array[mid] == target) {
				return mid;
			}
			if (array[mid] > target) {
				return recursiveBinarySearch(target,low,mid-1);
			}
			else {
				return recursiveBinarySearch(target, mid+1,high);
			}		
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {12, 10, 9, 45, 2, 10, 10, 45};
		MyArray a = new MyArray(array);
		int result = a.iterativeLinearSearch(45);
		int result2 = a.recursiveLinearSearch(array.length,15);
		System.out.println(result);
		System.out.println(result2);
		
		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
		int result3 = a.iterativeBinarySearch(45);
		int result4 = a.recursiveBinarySearch(12,0,array.length-1);
		System.out.println(result3);
		System.out.println(result4);

	}
}
