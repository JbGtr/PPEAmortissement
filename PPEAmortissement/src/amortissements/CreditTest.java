package amortissements;

import static org.junit.Assert.*;

import org.junit.Test;


	public class CreditTest {

			@Test
			public void testCalculeTaux()
			{
				int type = 1;
				double montant = 20000;
				double annuiteMaximale = 3100;
				int duree = 8;
				double taux = 3;
				Credit credit;
				credit = Credit.calculeTaux(Credit.AMORTISSEMENT_CONSTANTS, 20000, 3100, 8);
				assertTrue(type == credit.typeCredit());
				assertTrue(montant == credit.montantEmprunte());
				assertTrue(annuiteMaximale == credit.annuiteMaximale());
				assertTrue(duree == credit.duree());
				assertTrue(taux == credit.taux());
				
				
				
				annuiteMaximale = 2849;
				type = 2;
				credit = Credit.calculeTaux(Credit.ANNUITES_CONSTANTES, 20000, 2849, 8);
				assertTrue(type == credit.typeCredit());
				assertTrue(montant == credit.montantEmprunte());
				assertTrue(annuiteMaximale == credit.annuiteMaximale());
				assertTrue(duree == credit.duree());
				assertTrue(taux == credit.taux());
			}


			@Test
			public void testCalculeDuree() 
			{
				int type = 1;
				double montant = 20000;
				double annuiteMaximale = 3100;
				int duree = 8;
				double taux = 3;
				Credit credit;
					credit = Credit.calculeDuree(Credit.AMORTISSEMENT_CONSTANTS, 20000, 3100, 3);
					assertTrue(type == credit.typeCredit());
					assertTrue(montant == credit.montantEmprunte());
					assertTrue(annuiteMaximale == credit.annuiteMaximale());
					assertTrue(duree == credit.duree());
					assertTrue(taux == credit.taux());

				
				
				type = 2;
				annuiteMaximale = 2849;
					credit = Credit.calculeDuree(Credit.ANNUITES_CONSTANTES, 20000, 2849, 3);
					assertTrue(type == credit.typeCredit());
					assertTrue(montant == credit.montantEmprunte());
					assertTrue(annuiteMaximale == credit.annuiteMaximale());
					assertTrue(duree == credit.duree());
					assertTrue(taux == credit.taux());

				
			}

			@Test
			public void testCalculeMontantEmprunte() {
				int type = 1;
				double montant = 20000;
				double annuiteMaximale = 3100;
				int duree = 8;
				double taux = 3;
				Credit credit;
					credit = Credit.calculeMontantEmprunte(Credit.AMORTISSEMENT_CONSTANTS, 3100, 3, 8);
					assertTrue(type == credit.typeCredit());
					assertTrue(montant == credit.montantEmprunte());
					assertTrue(annuiteMaximale == credit.annuiteMaximale());
					assertTrue(duree == credit.duree());
					assertTrue(taux == credit.taux());
				
				type = 2;
				annuiteMaximale = 2849;
				credit = Credit.calculeMontantEmprunte(Credit.ANNUITES_CONSTANTES, 2849, 3, 8);
				assertTrue(type == credit.typeCredit());
				assertEquals(montant, credit.montantEmprunte(), 0.01);
				assertTrue(annuiteMaximale == credit.annuiteMaximale());
				assertTrue(duree == credit.duree());
				assertTrue(taux == credit.taux());

			}

			@Test
			public void testCalculeAnnuiteMaximale() 
			{
				int type = 1;
				double montant = 20000;
				double annuiteMaximale = 3100;
				int duree = 8;
				double taux = 3;
				Credit credit;
				credit = Credit.calculeAnuiteMaximale(Credit.AMORTISSEMENT_CONSTANTS, 20000, 3, 8);
					assertTrue(type == credit.typeCredit());
					assertTrue(montant == credit.montantEmprunte());
					assertTrue(annuiteMaximale == credit.annuiteMaximale());
					assertTrue(duree == credit.duree());
					assertTrue(taux == credit.taux());
				
				
				type = 2;
				annuiteMaximale = 2849;
					credit = Credit.calculeAnuiteMaximale(Credit.ANNUITES_CONSTANTES, 20000, 3, 8);
					assertTrue(type == credit.typeCredit());
					assertTrue(montant == credit.montantEmprunte());
					assertTrue(annuiteMaximale == credit.annuiteMaximale());
					assertTrue(duree == credit.duree());
					assertTrue(taux == credit.taux());
				
			}

}
