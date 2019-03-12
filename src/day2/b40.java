package day2;
import java.util.Scanner;
public class b40 {

	public static void main(String[] args) {
		int a, b,c, sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter The First Number");		
		a = sc.nextInt();
		
		System.out.println("Please Enter The Second Number");
		b = sc.nextInt();
		
		int total=0;
		
		for(int i=a ; i <= b ; i++)
		{
			
			if(i%2 ==0 && i%5 ==0 && i%3 !=0)
			{
				total +=i;
			}
		}
		System.out.println(total);
	}

}
