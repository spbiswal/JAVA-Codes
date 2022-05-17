/* Given an array of integer and a range. Write an algorithms to partition
array so that values smaller than range come to left, then values under the range
followed with values greater than the range.*/

import java.util.*;
public class RangePartition {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,l,m;
		System.out.println("How many Elements?");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter lower range");
		l=sc.nextInt();
		System.out.println("Enter higher range");
		m=sc.nextInt();
		System.out.println("Initial Array : ");
		printarray(arr);
		convert(arr,l,m);
		System.out.println("Final Array :");
		printarray(arr);
	}
	
	public static void  printarray(int arr[])
	{
		System.out.println(Arrays.toString(arr));
	}
	
	public static void convert(int[] arr, int lower, int higher) 
	{
		int size=arr.length;
		int start = 0;
		int end = size - 1;
		int i = 0;
		while (i <= end) {
			if (arr[i] < lower) {
				swap(arr, i, start);
				i += 1;start += 1;
			} else if (arr[i] > higher) {
				swap(arr, i, end);
				end -= 1;
			} else {
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


