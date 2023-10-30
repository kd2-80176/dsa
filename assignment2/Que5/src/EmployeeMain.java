import java.util.Arrays;

public class EmployeeMain {

	public static void sortBySalary(Employee arr[], int size) {
		for (int i = 1; i < size; i++) {
			for (int j = 0; j < size - i; j++) {
				if (arr[j].getSalary() < arr[j + 1].getSalary()) {
					Employee temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		System.out.println("After  sort");
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k].toString());
		}

	}

	public static void main(String[] args) {
		Employee[] arr = new Employee[6];

		arr[0] = new Employee(1, "shekhar", 25000);
		arr[1] = new Employee(2, "tanay", 15000);
		arr[2] = new Employee(3, "yash", 20000);
		arr[3] = new Employee(4, "dhaanaraj", 22000);
		arr[4] = new Employee(5, "pranav", 18000);
		arr[5] = new Employee(6, "krushna", 17000);

		System.out.println("Before sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());

		}

		sortBySalary(arr, arr.length);
	}

}
