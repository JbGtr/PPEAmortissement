package amortissements;

/**
 * Represente un credit.
 */

public class Credit 
{
	public final static int AMORTISSEMENT_CONSTANTS = 1,
			ANNUITES_CONSTANTES = 2;

	private int typeCredit;
	private double montantEmprunte;
	private double annuiteMaximale;
	private double taux;
	private int duree;
	/**
	 * Cree un credit.
	 */
	
	Credit (int typeCredit, double montantEmprunte, double annuiteMaximale,
			double taux, int duree)
	{
		this.typeCredit = typeCredit ;
		this.montantEmprunte = montantEmprunte;
		this.annuiteMaximale = annuiteMaximale;
		this.taux = taux;
		this.duree =duree;
	}
	
	/**
	 * Retourne le montant emprunte.
	 */
	public int typeCredit()
	{
		return typeCredit;
	}
	
	public double montantEmprunte()
	{
		
		return montantEmprunte;
	}
	
	/**
	 * Retourne le montant de la plus grande annuite. 
	 */
	
	public double getAnnuiteMaximale()
	{
		
		return annuiteMaximale;
	}
	
	/**
	 * Retourne le taux du credit.
	 */
	
	public double getTaux()
	{
		
		return taux;
	}
	
	/**
	 * Retourne nombre d'annuites a  verser.
	 */
	
	public int getDuree()
	{
		
		return duree;
	}
	
	/**
	 * Retourne le tableau d'amortissement du crÃ©dit.
	 */
	
	//this = credit actuel, cree un tableauamortissement du credit actuel et le retourne.
	
	public TableauAmortissement getTableauAmortissement()
	{
		
		return new TableauAmortissement(this);
	}
	
	/**
	 * Retourne un crÃ©dit en calculant automatiquement le taux.
	 */
	
	public static Credit calculeTaux(int typeCredit, 
			double montantEmprunte, double annuiteMaximale,
			int duree)
	{
		double taux = 0;
		
		if (typeCredit == AMORTISSEMENT_CONSTANTS)
		{
			double amortissement = (montantEmprunte/duree);
			taux = ((annuiteMaximale-amortissement)/(montantEmprunte)*100);
			System.out.println(taux);
			return new Credit(typeCredit, montantEmprunte, annuiteMaximale,
					 taux, duree);
		}
		return null;
	}
	
	/**
	 * Retourne un crÃ©dit en calculant automatiquement la durÃ©e.
	 */
	
	public static Credit calculeDuree(int typeCredit, 
			double montantEmprunte, double annuiteMaximale,
			double taux)
	{
		if (typeCredit == AMORTISSEMENT_CONSTANTS)
		{
			double interet = montantEmprunte * (taux/100) ;
			double amortissement = annuiteMaximale - interet;
			int duree = (int)(montantEmprunte/amortissement);
			return new Credit (typeCredit, montantEmprunte, annuiteMaximale, taux, duree);
		}
		return null;
	}

	/**
	 * Retourne un crÃ©dit en calculant automatiquement le montant
	 * 	qu'il est possible d'emprunter.
	 */
	
	public static Credit calculeMontantEmprunte(int typeCredit, 
			double annuiteMaximale,	double taux, int duree)
	{
		if(typeCredit == AMORTISSEMENT_CONSTANTS)
		{
			
		}
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
