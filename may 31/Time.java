package LabTest;

import java.util.*;
import java.time.*;

interface Sec
{
	public abstract void dispTime_InSec();
}

interface Hrs
{
	public abstract void dispTime_InHrs();
}

public class Time implements Sec,Hrs
{
 
	static Scanner sc =new Scanner(System.in);
 	
	
	@Override
	public void dispTime_InHrs() {
		 
		LocalDateTime t2 = LocalDateTime.now();
		System.out.println("Time in Hours : "+t2.getHour());
		
	}
	@Override
	public void dispTime_InSec() {
		 
		LocalDateTime t1 = LocalDateTime.now();
		System.out.println("Time in Seconds : "+t1.getSecond());
	}
	
	public static void main(String[] args) 
	{
		Time t1 = new Time();
		t1.dispTime_InSec();
		t1.dispTime_InHrs();
	}

	
 
	 

}

 
