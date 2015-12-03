package amortissements;

/**
 * Représente le tableau d'amortissement d'un crédit.
 */

public class TableauAmortissement 
{
	/**
	 * Crée le tableau d'amortissement du crédit passé en paramètre.
	 */
	
	private Ligne tableauAmor[];
	
	public TableauAmortissement(Credit credit)
	{
		tableauAmor = new Ligne [credit.duree()];
		tableauAmor[0] = Ligne.premiereLigne(credit);
		for (int i = 1; i < tableauAmor.length; i++) 
		{
			tableauAmor[i]= tableauAmor[i-1].ligneSuivante(credit);
		}
	}
	
	/**
	 * Retourne la durée de l'amortissement.
	 */
	
	public int getNbLignes()
	{
		return tableauAmor.length;
	}
	
	/**
	 * Retourne la i-ème ligne du tableau d'amortissement.
	 * Les indices commencent à 0.
	 */
	
	public Ligne getLigne(int i)
	{
		return tableauAmor[i-1];		
	}
	
	/**
	 * Retourne une représentation du tableau au format 
	 * chaîne de caractères.
	 */
	
	public String toString() {
		
		String leTableauAmortissement = "";
		for (int i = 0; i < tableauAmor.length; i++) {
			leTableauAmortissement += getLigne(i).toString();
		}
		
		return leTableauAmortissement;
	}
}
