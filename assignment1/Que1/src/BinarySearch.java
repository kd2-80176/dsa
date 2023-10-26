import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int arr[], int size, int key) {
		int left = 0;
		int right = size - 1;
		int count = 0;
		int mid = 0;
		while (left<=right) {
			count++;
			mid=(left+right)/2;

				if (key == arr[mid]) {
					System.out.println("element found");
					break;
					}
				else if (key < arr[mid])
					right = mid - 1;
				else
					left = mid + 1;
			
		}

		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 11,22,33,44,55,66,77,88 };
		int size = arr.length;
		int key;
		System.out.print("enter the key to find=");
		key = sc.nextInt();
		int iteration = binarySearch(arr, size, key);
		System.out.println("total iteration :" + iteration);

	}

}
