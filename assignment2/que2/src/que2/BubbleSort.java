package que2;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int arr[],int size) 
	{
	      int count=0;
	      int itr=0;
	      int flag=0;
          for(int i=0;i<size-1;i++)
          {
        	  flag =0;
        	  itr++;
        	for(int j=0;j<size-i-1;j++)
        	{
        		count++;
        	   if(arr[j]>arr[j+1])
        	   {
        		 int temp=arr[j];
        		 arr[j]=arr[j+1];
        		 arr[j+1]=temp;
        		 flag=1;
        	   }	
        	  
        	}
        	 if(flag==0)
      	   {
        		 System.out.println("Array is already sorted");
      		break;   
      	   }
        	
          }	
          System.out.println("Total iteration :"+itr);
          System.out.println("Total comparision="+count);
	}

	public static void main(String[] args) {
		
           int arr[]= {44,77,22,33,44,11,66};
           System.out.println("Before sort :"+Arrays.toString(arr));
           bubbleSort(arr,arr.length);
           System.out.println("After sort :"+Arrays.toString(arr));
	}

}
