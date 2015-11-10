package amortissements;

/**
 * Represente un credit.
 */

public class Credit 
{
	public final static int AMORTISSEMENT_CONSTANTS = 1,
			ANNUITES_CONSTANTES = 2;

	/**
	 * Cree un credit.
	 */
	
	Credit (int typeCredit, double montantEmprunte, double annuiteMaximale,
			double taux, int duree)
	{
		Credit credit = new Credit(typeCredit, montantEmprunte, annuiteMaximale, taux, duree); 
	}
	
	/**
	 * Retourne le montant emprunte.
	 */
	
	public double montantEmprunte()
	{
		// TODO à compléter
		return 0;
	}
	
	/**
	 * Retourne le montant de la plus grande annuite. 
	 */
	
	public double annuiteMaximale()
	{
		// TODO à compléter
		return 0;
	}
	
	/**
	 * Retourne le taux du credit.
	 */
	
	public double taux()
	{
		// TODO à compléter
		return 0;
	}
	
	/**
	 * Retourne nombre d'annuites a� verser.
	 */
	
	public int duree()
	{
		// TODO à compléter
		return 0;
	}
	
	/**
	 * Retourne le tableau d'amortissement du crédit.
	 */
	
	public TableauAmortissement getTableauAmortissement()
	{
		// TODO à compléter.
		return null;
	}
	
	/**
	 * Retourne un crédit en calculant automatiquement le taux.
	 */
	
	public static Credit calculeTaux(int typeCredit, 
			double montantEmprunte, double annuiteMaximale,
			int duree)
	{
		// TODO à compléter
		return null;
	}
	
	/**
	 * Retourne un crédit en calculant automatiquement la durée.
	 */
	
	public static Credit calculeDuree(int typeCredit, 
			double montantEmprunte, double annuiteMaximale,
			double taux)
	{
		// TODO à compléter
		return null;
	}

	/**
	 * Retourne un crédit en calculant automatiquement le montant
	 * 	qu'il est possible d'emprunter.
	 */
	
	public static Credit calculeMontantEmprunte(int typeCredit, 
			double annuiteMaximale,	double taux, int duree)
	{
		// TODO à compléter
		return null;
	}

	/**
	 * Retourne un crédit en calculant automatiquement
	 * l'annuité maximale.
	 */
	
	public static Credit calculeAnuiteMaximale(int typeCredit, 
			double montantEmprunte,	double taux, int duree)
	{
		// TODO à compléter
		return null;
	}
}
