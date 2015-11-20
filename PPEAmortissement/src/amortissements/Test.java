package amortissements;

public class Test {

	public static void main(String[] args) {
		
		Credit cr = new Credit();
		
		Credit c = cr.calculeDuree(1, 
			20000, 6000,5
			);
				
		System.out.println(c);
	}

}
