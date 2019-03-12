package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUsingBufferedReader {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String fname,lname,fullname;
		
		System.out.println("enter first name : ");
		fname = br.readLine();
				
		System.out.println("enter last name : ");
		lname = br.readLine();
		
		fullname = fname +" "+lname;
		System.out.println("Fullname is : "+fullname);
		

	}

}
