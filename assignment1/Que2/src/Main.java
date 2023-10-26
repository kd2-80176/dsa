import java.util.Iterator;
import java.util.Scanner;

import javax.xml.transform.sax.TemplatesHandler;

public class Main {

	public static int menu() {
		int choice;
		System.out.println("********************");
		System.out.println("0.EXIT");
		System.out.println("1.search empid");
		System.out.println("2.search by name");
		System.out.println("3.search by salary");
		System.out.println("********************");
		System.out.print("enter the choice=");
		choice = new Scanner(System.in).nextInt();
		System.out.println("********************");
		return choice;
	}

	public static void searchById(Employee arr[], int size, int id) {
		int left = 0;
		int mid;
		int right = size-1;

		while (left <= right) {
			mid = (right + left)/2;
			if (id == arr[mid].getId()) {
				System.out.println("id is found at :" + mid);
			break;
			}
			else if (id < arr[mid].getId())
				right = mid - 1;
			else
				left = mid + 1;
	
		}

	}
	public static void searchByName(Employee e[],int size,String name) 
	{
	  for(int i=0;i<size;i++) 
	  {
		if(name.equals(e[i].getName())) {
			System.out.println("employee is found at index:"+i);
			break;
		}
		
	  }	
	}
public static void searchBySalary(Employee e[],int size,double sal) {
	for(int i=0;i<size;i++)
	{
	  if(sal==e[i].getSalary()) 
	  {
		  System.out.println("Employee found at index :"+i);
	  }
	  
	}
	
}
	public static void main(String[] args) {
		int choice;
		
		Scanner sc = new Scanner(System.in);
		Employee[] e = new Employee[5];
		e[0] = new Employee(1, "shekhar", 10000.0);
		e[1] = new Employee(2, "tanay", 15000.0);
		e[2] = new Employee(3, "yash", 30000.0);
		e[3] = new Employee(4, "dhanraj", 12000.0);
		e[4] = new Employee(5, "patil", 9000.0);
		int size = e.length;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				System.out.print("Enter the id to search=");
				int id = sc.nextInt();
			
				searchById(e, size, id);
				break;
				
			case 2:
				System.out.print("Enter the name to search=");
                 String name=sc.next();
                 searchByName( e,size,name); 
                 
                 
				break;
			case 3:
				System.out.print("Enter the salary to search=");
				double sal=sc.nextDouble();
				searchBySalary(e, size, sal);
				break;
			default:
				break;
			}
		}
	}

}
