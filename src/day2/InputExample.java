package day2;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		int hs,es,cs,ms,hs1,total;
		double avg;

		
		System.out.println("enter id ");
		id = sc.nextInt(); //here nextInt is inbuilt function 
		
		System.out.println("enter name : ");
		name = sc.next(); // read string 
		
		System.out.println("enter mark : ");		
		hs = sc.nextInt();
		
		System.out.println("enter mark : ");
		es = sc.nextInt();
				
		System.out.println("enter mark : ");
		cs = sc.nextInt();
				
		
		System.out.println("enter mark : ");
		ms = sc.nextInt();
		
		System.out.println("enter mark : ");
		hs1 = sc.nextInt();
			

		total = hs+es+cs+ms+hs1;
		avg = total/5;
		System.out.println("Roll # "+id);
		System.out.println("Name "+name);
		System.out.println("Total Score "+total);
		System.out.println("Average score "+avg);
		
		
	}

}
