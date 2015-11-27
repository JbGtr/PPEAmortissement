package amortissements;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditTest {

	@Test
	public void testCalculeTaux() {
		
		double taux = 3;
		assertEquals(taux,Credit.calculeTaux(1, 20000, 3100, 8).taux(),0.1);
		
		/*double taux1 = 3;
		assertEquals(taux1,Credit.calculeTaux(2, 20000, 2849, 8).taux(),0);*/
	}

	@Test
	public void testCalculeDuree() {
		int duree = 8;
		assertEquals(duree,Credit.calculeDuree(1, 20000, 3100, 3).duree(),0.1);
		
		/*int duree1 = 8;
		assertEquals(duree1,Credit.calculeDuree(2, 20000, 2849, 3).duree(),0);*/

	}

	@Test
	public void testCalculeMontantEmprunte() {
		double montant = 20000;
		assertEquals(montant,Credit.calculeMontantEmprunte(1, 3100, 3, 8).montantEmprunte(),0.1);
		
		/*double montant1 = 20000;
		assertEquals(montant1,Credit.calculeMontantEmprunte(2, 2849, 3, 8).montantEmprunte(),0.1);*/
	}

	@Test
	public void testCalculeAnnuiteMaximale() {
		double annuiteMax = 3100;
		assertEquals(annuiteMax,Credit.calculeAnuiteMaximale(1, 20000, 3, 8).annuiteMaximale(),0.1);
		
		/*double annuiteMax1 = 2849;
		assertEquals(annuiteMax1,Credit.calculeAnnuiteMaximale(2, 20000, 3, 8).annuiteMaximale(),0.1);*/

	}
}
