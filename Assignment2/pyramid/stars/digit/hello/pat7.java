class pat7
{
	public static void main(String args[])
	{
		int a=1;
		for(int i=a;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+k);
			}

		System.out.println();
		}


	}
}