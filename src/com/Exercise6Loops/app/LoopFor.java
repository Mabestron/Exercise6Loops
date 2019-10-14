package com.Exercise6Loops.app;

public class LoopFor 
{

	public static void main(String[] args) 
	{
		//Constant Declaration
		
		//Variables Declaration
		
		//Object Construction
		
		//Create a serie 1-100 1 by 1
		for (int i=1;i<=100;i ++) 
		{
		System.out.println(i);	
		}
		
		//Create a serie 100-1 1 by 1
		for (int i=100;i>=1;i--) 
		{
		System.out.println(i);		
		}
		
		//Create a serie 1-100 2 by 2
		for (int i=1;i<=100;i+=2) 
		{
		System.out.println(i);		
		}
		
		//Create a serie 100-200 only in-par numbers
		System.out.println("Display numbers 100-200 impairs");
		for (int i=100;i<=200;i++) 
		{
			if(i%2==0)
			{
				continue;
			}
			
		System.out.println(i);		
		}
		
		//Create a serie 100-200 and stop in the middle
				System.out.println("Display numbers 100-200 and stop in the middle");
				for (int i=100;i<=200;i++) 
				{
					if(i==150)
					{
						break;
					}
					
				System.out.println(i);		
				}
	}
}
