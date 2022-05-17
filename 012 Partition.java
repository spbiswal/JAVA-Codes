/* Q. Given an array containing 0s, 1s and 2s. Write an algorithms to sort array so that 0s come first followed by 1s and then 2s in the end.*/


import java.util.*;
public class Partition012 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("How many Elements?");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements 0 or 1 or 2");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Initial Array : ");
		printarray(arr);
		convert(arr);
		System.out.println("Final Array :");
		printarray(arr);
	}
	
	public static void  printarray(int arr[])
	{
		System.out.println(Arrays.toString(arr));
	}
	
	public static void convert(int[] arr) 
	{
		int size=arr.length;
		int left = 0;
		int right = size - 1;
		int i = 0;
		while (i <= right) 
		{
			if (arr[i] == 0) 
			{
				swap(arr, i, left);
				i += 1;
				left += 1;
			} else if (arr[i] == 2) 
			{
				swap(arr, i, right);
				right -= 1;
			} else 
			{
				i += 1;
			}
		}
	}
	
	public static void swap(int arr[],int i,int j)
	{
		int temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
