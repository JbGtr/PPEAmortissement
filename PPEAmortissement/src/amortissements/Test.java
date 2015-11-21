package amortissements;

public class Test {

	public static void main(String[] args) {
		
		Credit cr = new Credit(1, 20000, 6000, 5, 4);
		
		Ligne lignecourante = Ligne.premiereLigne(cr);		
		System.out.println(lignecourante.getAnnee() + " | " + lignecourante.getCapitalInitial() + " | " + lignecourante.getInterets() + " | " + lignecourante.getAmortissements()  + " | " + lignecourante.getAnnuite() + " | " + lignecourante.getCapitalFinal());
		
		int anneerestante = cr.duree();
		while(anneerestante>0)
		{
			Ligne prochaineligne = Ligne.ligneSuivante(cr, lignecourante);
			lignecourante=prochaineligne;
			System.out.println(lignecourante.getAnnee() + " | " + lignecourante.getCapitalInitial() + " | " + lignecourante.getInterets() + " | " + lignecourante.getAmortissements()  + " | " + lignecourante.getAnnuite() + " | " + lignecourante.getCapitalFinal());
		}
	}

}
