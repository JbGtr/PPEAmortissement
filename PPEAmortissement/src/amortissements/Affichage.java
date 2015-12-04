package amortissements;

import javax.swing.SwingUtilities;

public class Affichage {

	public static void main(String[] args) {
		Credit cred = Credit.calculeAnuiteMaximale(1, 100000, 3, 12);
		TableauAmortissement tab = new TableauAmortissement(cred);
		Interface inter = new Interface(tab);
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				inter.setVisible(true);
			}
		});
	}

}
