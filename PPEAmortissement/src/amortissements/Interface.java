package amortissements;
import java.awt.Dimension;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Interface extends JFrame{

	Object[][] Graph;
	private JTable tableau;
	private JPanel panel;
	private DefaultTableModel model;
	private JScrollPane scrollPane;
	private TableauAmortissement tabAmor;
	
	public Interface(TableauAmortissement Tab)
	{
		tabAmor = Tab;
		build();
	}
	public void build()
	{
		setTableau();
		this.setTitle("Amortissement");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setPreferredSize(new Dimension(700, 400));
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setContentPane(buildCurrentPanel());
		this.pack();
	}
	public JPanel buildCurrentPanel()
	{
		panel = new JPanel();
		panel.add(scrollPane);
		return panel;
		
	}
	public DefaultTableModel getModel()
	{
		String[] debut = {"Année", "Capital Initial", "Interet", "Amortissement", "Anuité", "Capital Final"};
		model = new DefaultTableModel(initDonnesTableau(), debut);
		return model;
	}
	public void setTableau()
	{
		tableau = new JTable();
		tableau.setModel(getModel());
		scrollPane = new JScrollPane(tableau);
		scrollPane.setPreferredSize(new Dimension(600, 250));	
	}
	
	public Object[][] initDonnesTableau()
	{
		Graph = new Object[tabAmor.getNbLignes()][7];
		System.out.println(tabAmor.getNbLignes());
			for (int i = 0; i < tabAmor.getNbLignes(); i++) {
				Graph[i][0] = tabAmor.getLigne(i).getAnnee();
				Graph[i][1] = Math.round(tabAmor.getLigne(i).getCapitalInitial());
				Graph[i][2] = Math.round(tabAmor.getLigne(i).getInterets());
				Graph[i][3] = Math.round(tabAmor.getLigne(i).getAmortissements());
				Graph[i][4] = Math.round(tabAmor.getLigne(i).getAnnuite());
				Graph[i][5] = Math.round(tabAmor.getLigne(i).getCapitalFinal());
			}
		return Graph;
	}
}