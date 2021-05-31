package LabTest;



public class exce2 {
	
	void show(int a)
	{
		try {
			int b = a/0;
			System.out.println(b);
		}catch(ArithmeticException e)
		{
			System.err.println(e);
		}
	}
	
	void show1(String s)
	{
		try {
			s ="";
			System.out.println(s.length());
		}catch(NullPointerException e)
		{
			System.err.println(e);
		}
	}
	
	void show2(int i)
	{
		try {
		int c [] = new int[5];
		System.out.println(c[i]);
		}catch(ArrayOutOfBoundException e)
		{
			System.err.println(e);
		}
	}
	public static void main(String[] args)
	{
		exce2 t = new exce2();
		t.show(25);
		t.show1(null);
		t.show(5);
	}

}
