import java.util.*;


public class Q1M {
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("How many elements?");
		n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		findrepeat(a);
		sc.close();
	}
	
	public static void findrepeat(int[] a)
	{
		
		int m=0,n=a.length;
		if(n==0)
		{
			System.out.println("Array Empty");
		}
		else if(n==1)
		{
			System.out.println("Only one element");
		}
		else
		{
				
		for(int i=0;i<a.length-2;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
			if(a[i]==a[j])
			{
				m=a[i];
				break;
			}
			}
		}
		if(m==0)
		{
			System.out.println("No Repeat Elements");
		}
		else
			System.out.println(m+ "First repeat Element");
						
		}

	}}


