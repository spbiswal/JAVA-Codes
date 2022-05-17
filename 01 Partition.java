/*Q.Given an array containing 0s and 1s. Write an algorithms to sort array so that 0s come first followed by 1s.*/

import java.util.*;
public class Partition01 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("How many Elements?");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements 0 & 1");
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
		while (left < right) 
		{
			while (arr[left] == 0)
				left += 1;
			while (arr[right] == 1)
				right -= 1;
			if (left < right)
			{
				swap(arr, left, right);
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
