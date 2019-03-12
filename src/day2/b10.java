package day2;

import java.util.Scanner;

public class b10 {
	

	public static void main(String[] a)
	{
			Scanner sc =new Scanner(System.in);
			int unit;
			double price;
			
			System.out.println("enter unit ");
			unit = sc.nextInt();
			
			if(unit<100)
			{
				price = unit*.40;
				
			}
			else if(unit <300)
			{
				price = 40 + (unit -100)*.50;
			}
			else
			{
				price = 140 + (unit -300)*.60;
			}
			
			double total = price+50;
			
			System.out.println("total = "+total);
			
			
			
			
				
 }
}
