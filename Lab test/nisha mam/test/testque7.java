import java.util.Scanner;
class testque7
{
	byte num;

	int scan()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (-128 to 127) : ");
		num = sc.nextByte();
		
		System.out.println("Press 1 for integer \nPress 2 for character \nPress 3 for float");
		System.out.print("Enter your choice here : ");
		int n = sc.nextInt();
		return n;
	}
       
	void toint()				//for byte to int
	{
		int b = num;
		System.out.print("Integer = "+b);
	}
	
	void tochar()				//for byte to char
	{
		char c = (char)num;
		System.out.print("Character = "+c);
	}
	
	void tofloat()				//for byte to float
	{
		float f = (float)num;
		System.out.print("Float = "+f);
	}
	

	public static void main(String [] args)
	{
		
		testque7 t = new testque7();
		int choice = t.scan();
		
		switch (choice)
		{
			case 1:
				t.toint();
			break;

			case 2:
				t.tochar();
			break;
		
			case 3:
				t.tofloat();
			break;
		}
	}
}