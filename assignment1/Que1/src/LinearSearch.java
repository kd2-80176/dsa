import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int arr[],int size,int key) {
		int count=0;
		for(int i=0;i<size;i++) 
		{
			 count++;
			if(arr[i]==key)
			{
				break;
			}
			 
		}
         return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {33,44,22,77,66,88,11};
          int size=arr.length;
          int key;
          System.out.print("enter the key to find=");
          key=sc.nextInt();
          int iteration= linearSearch(arr,size,key);
          System.out.println("total iteration :"+iteration);
          
          
	}

}
