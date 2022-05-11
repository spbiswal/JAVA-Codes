import java.util.*;

//Driver Code

public class FirstRepeatElement {
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in); //Scanner_Class
		
		
		System.out.println("How many elements?");
		n=sc.nextInt();
		int[] a=new int[n]; //Array_Size_Accoring_to_the_user's_Requirement		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		findrepeat(a); //Function_Call
		sc.close();
	}
	
//Function
	
	public static void findrepeat(int[] a)
	{
		
		int m=0,n=a.length;
		if(n==0) //Checks if array is Empty i.e. size=0
		{
			System.out.println("Array Empty"); 
		}
		else if(n==1) //Checks if array has only one element i.e. size=1
		{
			System.out.println("Only one element");
		}
		else
		{
				
		for(int i=0;i<a.length-2;i++) //To fix a pivot element
		{
			for(int j=i+1;j<a.length;j++) //To compare next elements of the selected pivot element
			{
			if(a[i]==a[j]) //Checks Equality of the two elements
			{
				m=a[i]; //Stores the 1st repeated element
				break; //Exits the control
			}
			}
		}
		if(m==0) //Checks if no element is repeated
		{
			System.out.println("No Repeat Elements");
		}
		else
			System.out.println(m+ "First repeat Element"); //Print the desired Element
						
		}

	}
}


