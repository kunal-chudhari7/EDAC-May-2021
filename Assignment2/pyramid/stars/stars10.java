class stars10
{
	public static void main(String args[])
	{
	
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
			System.out.print(" ");	
			}
				for(int k=1;k<=i;k++)
				{
				System.out.print("*");
				}
						for(int m=4;m>=i;m--)	
						{
						System.out.print("*");
						} 
							for(int n=2;n<=i;n++)
							{
							System.out.print(" ");
							}

		System.out.println();
		}
 
		 

	}
}
