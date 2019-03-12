package day2;

public class QuestionA2 {

	public static void main(String[] args) {
		
		int id;
		String name;
		int hs,es,cs,ms,hs1,total;
		double avg;
		
		id =101;
		name ="Raman Sinha";
		hs =77;
		es =89;
		ms =78;
		cs =67;
		hs1 =69;
		
		
		total = hs+es+cs+ms+hs1;
		avg = total/5;
		System.out.println("Roll # "+id);
		System.out.println("Name "+name);
		System.out.println("Total Score "+total);
		System.out.println("Average score "+avg);
		
		///
		float f =3.14f;		
		float out  = 2*3*f;
		System.out.println(out);
		
		

	}

}
