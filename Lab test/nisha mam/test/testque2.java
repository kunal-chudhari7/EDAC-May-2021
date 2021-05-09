import java.util.*;

class testque2
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("*************************************************");
		System.out.format("Enter Table Number : ");
		int a = sc.nextInt();
		System.out.printf("Number %d Multiplication Table\n",a);
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d*%d : %d\n",a,i,a*i);
		}
		
	}
}
