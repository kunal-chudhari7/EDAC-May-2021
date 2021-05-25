package Test;
import java.util.*;
public class test
{
	static String color;
	String type;
	int tyres;
	String engine;
	int cylinder;
	int gears;
	public test(String type, int tyres, String engine, int cylinder)
{
		this.type = type;
		this.tyres = tyres;
		this.engine = engine;
		this.cylinder = cylinder;
		this.gears=gears;
}
	void specs(test obj)
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter total no of tyres : ");
	tyres = sc.nextInt();
	
	System.out.println("Enter the total no of gears : ");
	gears = sc.nextInt();
	
	System.out.println("Enter the total no of cylinders: ");
	cylinder = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the type of vehicle : ");
	type = sc.nextLine();
	
	System.out.println("Enter the color of vehicle : ");
	color = sc.nextLine();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the type of : "+"\n");
		String obj [] =new String[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("Movie ["+i+"] : ");
			
			obj[i]=sc.nextLine();
			
	}

}
}
