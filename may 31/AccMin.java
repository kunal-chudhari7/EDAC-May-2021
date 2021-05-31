package LabTest;
import java.util.*;

interface sec1
{
	public abstract void dispTime_InSec();
}

interface hrs1
{
	public abstract void dispTime_InHrs();
}

public class AccMin implements sec1,hrs1
{
	static float sec;
	static float min;
	static float hrs;
	static Scanner sc =new Scanner(System.in);
	public void Accept_Min()
	{
		System.out.println("Enter Minutes :");
		min = sc.nextFloat();
		
	}
	@Override
	public void dispTime_InHrs() {
		hrs =  min / 60;
		System.out.println("Hours : "+hrs);
		
	}
	@Override
	public void dispTime_InSec() {
		sec = min * 60;	
		System.out.println("Seconds : "+sec);
	}
	
	public static void main(String[] args) 
	{
		AccMin t1 = new AccMin();
		t1.Accept_Min();
		t1.dispTime_InSec();
		t1.dispTime_InHrs();
	}
}

