package day2;

import java.util.Scanner;

public class b38 {
public static void main(String[] a)
{
	int number,sum=0,count=0;
	Scanner sc=new Scanner(System.in);
	double avg=0;
	System.out.println("enter the number");
	number=sc.nextInt();
for(int i=0;i<number;i++)
{
	if(i%2==0)
	{
		sum +=i;
		count =count+1;
	}
	
}
System.out.println(sum);
avg=sum/count;
System.out.println(avg);
	
}

}
