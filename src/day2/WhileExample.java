package day2;

public class WhileExample {

	public static void main(String[] args) {

		int i=1; //init
		
		while(i<10) {//condition/limit 
			
			System.out.println(i);
			i++; //increment
		}

		//print in reverse order
		i =10;
		while(i>0) {
			System.out.println(i);
			i--;
		}
		//print all odd numbers between 1 to 30
		i =1;
		while(i<30)
		{
			System.out.println(i);
			i=i+2;
			
		}
		
		//wap to get sum or all even and odd numbers between 1 to 100
		int se=0;
		int so =0;
		i =1;
		while(i<=100)
		{
			
			if(i%2==0)
			{
				se +=i;
			}
			else
			{
				so+=i;
			}
			i++;
		}
		System.out.println("sum of all even "+se);
		System.out.println("sum of all odd "+so);
	}

}
