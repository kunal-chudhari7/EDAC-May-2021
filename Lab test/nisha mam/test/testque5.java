import java.util.*;

class testque5
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			 System.out.print("Enter an Element ["+i+"] : ");
			a[i]=sc.nextInt();
		}
		 
		for(int i=a.length-1;i>=0;i--)
		{
		System.out.println(a[i]+" ");
		}
		 		
		
		
	}
}
