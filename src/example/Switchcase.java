package example;

public class Switchcase {

	public static void main(String[] args) {

		//Print day based on given input
		int day=4;
		
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wedneday");
				break;
			case 4:
				System.out.println("Thurday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			
			default:
				System.out.println("Other day or not match");
				break;
		}

	}

}
