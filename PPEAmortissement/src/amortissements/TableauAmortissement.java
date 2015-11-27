package amortissements;

/**
 * Représente le tableau d'amortissement d'un crédit.
 */

public class TableauAmortissement 
{
	/**
	 * Crée le tableau d'amortissement du crédit passé en paramètre.
	 */
	
	Ligne TableauAmor[] = new Ligne [5];
	
	public TableauAmortissement(Credit credit)
	{
		
	}
	
	/**
	 * Retourne la durée de l'amortissement.
	 */
	
	public int getNbLignes()
	{
		return TableauAmor.length;
	}
	
	/**
	 * Retourne la i-ème ligne du tableau d'amortissement.
	 * Les indices commencent à 0.
	 */
	
	public Ligne getLigne(int i)
	{
		// TODO à compléter.
		return null;		
	}
	
	/**
	 * Retourne une représentation du tableau au format 
	 * chaîne de caractères.
	 */
	
	public String toString() {
		// TODO à compléter.
		return null;
	}
}
