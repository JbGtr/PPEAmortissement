package amortissements;

public class Test {

	public static void main(String[] args) {
		
		Credit cr = new Credit(1, 20000, 6000, 5, 4);
		
		Ligne premiereligne = Ligne.premiereLigne(cr);		
		System.out.println(premiereligne.getAnnee() + " | " + premiereligne.getCapitalInitial() + " | " + premiereligne.getInterets() + " | " + premiereligne.getAmortissements()  + " | " + premiereligne.getAnnuite() + " | " + premiereligne.getCapitalFinal());
	}

}
