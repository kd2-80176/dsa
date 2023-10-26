package que3;

import java.util.Scanner;

public class DescArray {
	public static void search(int arr[],int size,int key) 
	{
	    int right=size-1;
	    int left=0;
	    int mid;
	    while(left<=right) 
	    {
	      mid=(left+right)/2;
	       if(key==arr[mid]) {
	    	   System.out.println("element is found at index :"+mid);
	       break;
	       }
	       else if(key<arr[mid])
	    	   left=mid+1;
	       else
	    	right=mid-1;
	    }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {99,88,77,66,55,44,33,22,11};
		int size=arr.length;
		System.out.print("enter the element to find=");
		int key=sc.nextInt();
		search(arr, size, key);

	}

}
