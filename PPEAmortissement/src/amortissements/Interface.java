package amortissements;

import javax.swing.*;

public class Interface{

	/**
	 * @param args
	 */
	public static void main(String[] args){
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Interface graphique");
		fenetre.setSize(300, 200);
		
		JLabel label = new JLabel("Bonjour");
		fenetre.getContentPane().add(label);
		
		fenetre.setVisible(true);
	}
}
