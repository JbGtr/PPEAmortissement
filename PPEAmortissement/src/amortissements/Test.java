package amortissements;

public class Test {

	public static void main(String[] args) {
		
		Credit c = Credit.calculeTaux(1, 20000, 6000, 4);
		
		System.out.println(c.getTableauAmortissement());
		}
	}

