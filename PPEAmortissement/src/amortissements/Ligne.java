package amortissements;

/**
 * Ligne du tableau d'amortissement d'un crédit.
 */

public class Ligne 
{
	/**
	 * Crée une ligne à partir des valeurs passées en paramètres.
	 */
	
	private int annee;
	private double capitalInitial;
	private double interets;
	private double amortissements;
	private double annuite;
	private double capitalFinal;

	Ligne(int annee, double capitalInitial, double interets, 
			double amortissements, double annuite, double capitalFinal)
	{
		this.annee = annee;
		this.capitalInitial = capitalInitial;
		this.interets = interets;
		this.amortissements = amortissements;
		this.annuite = annuite;
		this.capitalFinal = capitalFinal;	
	}

	/**
	 * Retourne l'indice de l'année concernée par la ligne.
	 * Les indices commencent à 1.
	 */
	
	public int getAnnee()
	{
		return annee;
	}
	
	/**
	 * Retourne le montant du capital restant dû au début 
	 * de la période.
	 */
	
	public double getCapitalInitial()
	{
		return capitalInitial;
	}
	
	/**
	 * Retourne le montant des intérêts versés pendant la période.
	 */
	
	public double getInterets()
	{
		return interets;
	}

	/**
	 * Retourne le montant du capital amorti pendant la période.
	 */
	
	public double getAmortissements()
	{
		return amortissements;
	}

	/**
	 * Retourne le montant de l'annuité pendant la période.
	 */
	
	public double getAnnuite()
	{
		return annuite;
	}
	
	/**
	 * Retourne le montant du capital restant dû à la fin
	 * de la période.
	 */
	
	public double getCapitalFinal()
	{
		return capitalFinal;
	}
	
	/**
	 * Retourne la première ligne du tableau d'amortissement pour
	 * le crédit passé en paramètre.
	 */
	
	public static Ligne premiereLigne(Credit credit)
	{
		double amortissement = (credit.montantEmprunte()/credit.duree());
		double capitalFinal = (credit.montantEmprunte()- amortissement);
		double interet = (credit.montantEmprunte()*(credit.taux()/100));
		return new Ligne (1, credit.montantEmprunte(), interet, amortissement, credit.annuiteMaximale(), capitalFinal);
	}

	/**
	 * Retourne la ligne suivant la ligne courante pour le 
	 * passé en paramètre. Retoure null si la ligne courante est
	 * la dernière ligne.
	 */
	
	public static Ligne ligneSuivante(Credit credit, Ligne lignecourante)
	{
		if(lignecourante.annee == credit.duree())
		{
			return null;
		}
		else
		{
			int numannee = lignecourante.annee++;
			double montantEmprunt = lignecourante.capitalFinal;
			double interet = (montantEmprunt*(credit.taux()/100));
			double annuite = lignecourante.amortissements + interet;
			double capitalFinal = montantEmprunt - lignecourante.amortissements;
			
			return new Ligne(numannee, montantEmprunt, interet, lignecourante.amortissements, annuite, capitalFinal);
		}
	}
}
