package que1;

import java.util.Arrays;

public class SelectionSort {

	public static int selectionSort(int arr[], int size) {
		int count = 0;
		for (int i = 0; i < size - 1; i++) {
			
			for (int j = i + 1; j < size; j++) {
				count++;
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 44, 22, 55, 77, 33, 11, 66 };
		System.out.println("Befor sort :" + Arrays.toString(arr));
		int comparision = selectionSort(arr, arr.length);

		System.out.println("after sort :" + Arrays.toString(arr));
		System.out.println("no oof comparision :" + comparision);

	}

}