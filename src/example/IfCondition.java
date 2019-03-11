package example;

public class IfCondition {

	public static void main(String[] args) {
	
		//if condition 
		int n=330;
		//Check even no 
		if(n%2==0)
		{
			System.out.println("even");
		}
		
		//if else : check even or odd 
		if(n%2==0)
		{
			System.out.println("even number");
		}
		else {
			System.out.println("odd number ");
		}
		
		//if else if else if else .. / ladder if else 
		int a,b,c;
		a =44;
		b =55;
		c =55;
		
		//show greater no
		if(a>b && a>c)
		{
			System.out.println("a is greater ");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater ");
		}
			
		//nested if else 
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
				
	}

}
