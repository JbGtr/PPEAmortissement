package amortissements;

public class Test {

	public static void main(String[] args) {
		
		Credit cr = new Credit();
		
		Credit c = cr.calculeTaux(1, 
			20000, 6000,4
			);
				
		System.out.println(c);
	}

}
