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
		typeCredit = 0;
		montantEmprunte = 0;
		annuiteMaximale = 0;
		taux = 0;
		duree = 0;
	}
	
	/**
	 * Retourne le montant emprunte.
	 */
	
	public double montantEmprunte()
	{
		// TODO Ã  complÃ©ter
		return 0;
	}
	
	/**
	 * Retourne le montant de la plus grande annuite. 
	 */
	
	public double annuiteMaximale()
	{
		// TODO Ã  complÃ©ter
		return 0;
	}
	
	/**
	 * Retourne le taux du credit.
	 */
	
	public double taux()
	{
		// TODO Ã  complÃ©ter
		return 0;
	}
	
	/**
	 * Retourne nombre d'annuites a  verser.
	 */
	
	public int duree()
	{
		// TODO Ã  complÃ©ter
		return 0;
	}
	
	/**
	 * Retourne le tableau d'amortissement du crÃ©dit.
	 */
	
	public TableauAmortissement getTableauAmortissement()
	{
		// TODO Ã  complÃ©ter.
		return null;
	}
	
	/**
	 * Retourne un crÃ©dit en calculant automatiquement le taux.
	 */
	
	public static Credit calculeTaux(int typeCredit, 
			double montantEmprunte, double annuiteMaximale,
			int duree)
	{
		// TODO Ã  complÃ©ter
		return null;
	}
	
	/**
	 * Retourne un crÃ©dit en calculant automatiquement la durÃ©e.
	 */
	
	public static Credit calculeDuree(int typeCredit, 
			double montantEmprunte, double annuiteMaximale,
			double taux)
	{
		// TODO Ã  complÃ©ter
		return null;
	}

	/**
	 * Retourne un crÃ©dit en calculant automatiquement le montant
	 * 	qu'il est possible d'emprunter.
	 */
	
	public static Credit calculeMontantEmprunte(int typeCredit, 
			double annuiteMaximale,	double taux, int duree)
	{
		// TODO Ã  complÃ©ter
		return null;
	}

	/**
	 * Retourne un crÃ©dit en calculant automatiquement
	 * l'annuitÃ© maximale.
	 */
	
	public static Credit calculeAnuiteMaximale(int typeCredit, 
			double montantEmprunte,	double taux, int duree)
	{
		// TODO Ã  complÃ©ter
		return null;
	}
}
