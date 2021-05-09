import java.util.*;

class testque3
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter a value of b : ");
		int b = sc.nextInt();
		int c;
		System.out.printf("Before Swap : A = %d & B = %d\n",a,b);
		c=a;
		a=b;
		b=c;
		System.out.printf("After Swap : A = %d & B = %d\n",a,b);
		
		
	}
}
