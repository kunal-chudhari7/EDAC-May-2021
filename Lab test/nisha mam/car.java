package Test;
import java.util.*;
public class car
{
	static String color;
	String type;
	int tyres;
	String engine;
	int cylinder;
	int gears;
	public car(String type, int tyres, String engine, int cylinder)
{
		this.type = type;
		this.tyres = tyres;
		this.engine = engine;
		this.cylinder = cylinder;
		this.gears=gears;
}
	 
	
	void display()
	{
		System.out.println("Enter type of vehicle : "+type);
		System.out.println("Enter total no of tyres : "+tyres);
		System.out.println("Enter total no of color : "+color);
		System.out.println("Enter total no of cylinder : "+cylinder);
		System.out.println("Enter total no of gears : "+gears);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the type of : "+"\n");
		String obj [] =new String[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("Type ["+i+"] : ");
			
			obj[i]=sc.nextLine();
			
	}
		 
		System.out.println("Enter total no of tyres : ");
		int tyres = sc.nextInt();
		
		System.out.println("Enter the total no of gears : ");
		int gears = sc.nextInt();
		
		System.out.println("Enter the total no of cylinders: ");
		int cylinder = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the type of vehicle : ");
		String type = sc.nextLine();
		
		System.out.println("Enter the color of vehicle : ");
		String color = sc.nextLine();
		car c = new car(type,tyres,color,cylinder,gears);
		c.display();

}
}
