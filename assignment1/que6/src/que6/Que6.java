package que6;

import java.util.Scanner;

public class Que6 {

	public static int rank(int arr[], int size, int key) {
		int count = 0;
		int ele;
		for (int i = 0; i < size; i++) {
			if (key>=arr[i]) {
				count++;
			}

		}
		 return count;
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 15, 3, 4, 4, 1   };
		int size = arr.length;
		System.out.print("Enter key  to find rank=");
		int key = new Scanner(System.in).nextInt();
		int ele = rank(arr, size, key);
		System.out.println("Rank of " + key + " is :" + ele);
	}

}
