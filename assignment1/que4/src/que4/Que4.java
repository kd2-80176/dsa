package que4;

import java.util.Scanner;

public class Que4 {
	public static int linearSearch(int arr[], int size, int key, int n) {
		int count = 0;
		for (int i = 0; i < size; i++) {

			if (arr[i] == key) {
				count++;
				if (count == n) 
					return 1;
				
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 22, 66, 33, 66, 22, 10, 77, 66, 99, 45 };
		int size = arr.length;
		System.out.print("enter the key :");
		int key = sc.nextInt();
		System.out.print("enter the occurances :");
		int n = sc.nextInt();
		int occu = linearSearch(arr, size, key, n);
		if (occu == 1) 
             System.out.println("key is found at "+n+" occurance");
        else
        	System.out.println("occurance is not found");
		
	}

}
