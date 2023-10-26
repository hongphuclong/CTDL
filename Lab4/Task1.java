package Lab4;

import java.util.Arrays;
import java.util.Iterator;

public class Task1 {
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	// sort by descending order
	public static int[] selectionSort(int [] array) {
		for (int i = 0; i < array.length -1; i++) {
			int maxIndex = i;
			for (int j = i +1; j < array.length; j++) {
				if(array[j] > array[maxIndex]) {
					maxIndex = j;
				}
			}
			swap(array, i, maxIndex);
		}
		return array;
	}
	// sort by descending order
	public static int[] bubbleSortInterativeDescending(int[] array) {
		// TODO
		for (int i = 0; i < array.length -1; i++) {
			for (int j = 0; j < array.length -i -1; j++) {
				if(array[j] < array[j+1]) {
					swap(array, j, j+1);
				}
			}
		}
		return array;
	}
	// sort by descending order
	public static int[] insertionSort(int[] array) {
		// TODO
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i -1;
			while(j  >=0 && array[j] < key) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
		return array;
	}

	public static void main(String[] args) {
		int[] arr = {3,1,4,1,6,9};
		int [] arr1 = {2,8,4,7,10,14};
		System.out.println(Arrays.toString(selectionSort(arr)));
		System.out.println(Arrays.toString(bubbleSortInterativeDescending(arr1)));
		System.out.println(Arrays.toString(insertionSort(arr)));

	}
}
