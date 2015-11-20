package amortissements;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditTest {

	@Test
	public void testcalculTaux() {
		int type = 1;
		double emprunt = 1500;
		double annuiteMaxi = 128.44;
		int duree = 19;
		double taux = 3.3;
		Credit credit = Credit.calculeTaux(Credit.AMORTISSEMENT_CONSTANTS, 1500, 128.44, 19);
		assertTrue(type == credit.typeCredit());
		assertTrue(emprunt == credit.montantEmprunte());
		assertTrue(annuiteMaxi == credit.annuiteMaximale());
		assertTrue(duree == credit.duree());
		assertTrue(taux == credit.taux());
		
		

	}
	
	@Test
	public void testcalculDuree() {
		assertEquals();
	}
	
	@Test
	public void testcalculeMontantEmprunte() {
		assertEquals();
	}
	
	@Test
	public void testcalculeAnuiteMaximale() {
		assertEquals();
	}
}
