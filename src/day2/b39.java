package day2;
import java.util.Scanner;
public class b39 {
public static void main(String[] a) {
	int number;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	number= sc.nextInt();
	for(int i=1;i<=10;i++)
	{
	int	table=number*i;
	System.out.println(table);
	}
}
}
