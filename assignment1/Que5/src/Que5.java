
public class Que5 {
	public static int  nonReap(int arr[], int size) {
		int count = 0;
		int ele;
		for (int i = 0; i < size; i++) {
			ele = arr[i];
			for (int j = 0; j < size; j++) {
				if (i != j) {
					if (ele == arr[j]) {
						ele = 0;
						break;
					}
				}
			}
			if (ele != 0) {
				return ele;
			}

		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int size = arr.length;
		int ele=nonReap(arr, size);
		System.out.println("non first repeating element="+ele);
	}

}
