package amortissements;

import javax.swing.SwingUtilities;

public class Affichage {

	public static void main(String[] args) {
		Credit cred = Credit.calculeAnuiteMaximale(1, 100000, 3, 30);
		cred = Credit.calculeTaux(1, 20000, 6000, 4);
		TableauAmortissement tab = new TableauAmortissement(cred);
		Interface inter = new Interface(tab);
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				inter.setVisible(true);
			}
		});
	}

}
