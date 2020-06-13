package it.unipv.ingsw.progettoe20.server.admin.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import it.unipv.ingsw.progettoe20.server.admin.controller.AdministratorController;

/*
 Prima schermata di interfaccia dell'amministratore.
 Offre la scelta tra gestione delle tariffe e gestione dei parcheggi
*/

<<<<<<< HEAD
public class AdministratorGUI extends AbstractGUI {
=======

/**
 * The type Administrator gui.
 */
public class AdministratorGUI extends JFrame {
>>>>>>> 8193458d93fb8d20871a3536cffa0d2f536151ee

	private JLabel title;
	private JPanel panel;
	private JButton btnParkings, btnPrices, btnLavels;
	private AdministratorController administratorController;

	/**
	 * Instantiates a new Administrator gui.
	 */
	public AdministratorGUI() {
		super();
		administratorController = new AdministratorController(this);
	}

	public JButton getBtnParkings() {
		return btnParkings;
	}

	public JButton getBtnPrices() {
		return btnPrices;
	}

	public JButton getBtnLevels() {
		return btnLavels;
	}

	@Override
	public void initComponents() {

		panel = new JPanel();
		title = new JLabel("ADMINISTRATOR");
		btnParkings = new JButton("Parking Management");
		btnPrices = new JButton("Price Management");
		btnLavels = new JButton("Level Management");

		// frame settings
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setMinimumSize(new Dimension(600, 400));
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("ADMINISTRATOR GUI");

		// panel settings
		panel.setBackground(new Color(30, 30, 30));
		panel.setLayout(null);

		// label settings
		title.setFont(new Font(Font.MONOSPACED, 3, 30)); // 3 = bold e italic
		title.setForeground(new Color(196, 10, 255));

		// btnParkings settings
		btnParkings.setFont(new Font(Font.MONOSPACED, 1, 20)); // 1 = bold
		btnParkings.setBackground(new Color(222, 177, 255));

		// btnPrices settings
		btnPrices.setFont(new Font(Font.MONOSPACED, 1, 20));
		btnPrices.setBackground(new Color(222, 177, 255));

		// btnLevels settings
		btnLavels.setFont(new Font(Font.MONOSPACED, 1, 20));
		btnLavels.setBackground(new Color(222, 177, 255));

		// locations settings
		btnParkings.setBounds(140, 180, 300, 40);
		btnLavels.setBounds(140, 130, 300, 40);
		btnPrices.setBounds(140, 230, 300, 40);
		title.setBounds(25, 10, 500, 40);

		panel.add(title);
		panel.add(btnParkings);
		panel.add(btnLavels);
		panel.add(btnPrices);

<<<<<<< HEAD
		
	}

	@Override
	public void initListener() {
		// TODO Auto-generated method stub
		
=======
		administratorController = new AdministratorController(this);
	}

	/**
	 * Gets btn parkings.
	 *
	 * @return the btn parkings
	 */
	public JButton getBtnParkings() {
		return btnParkings;
	}

	/**
	 * Gets btn prices.
	 *
	 * @return the btn prices
	 */
	public JButton getBtnPrices() {
		return btnPrices;
	}

	/**
	 * Gets btn levels.
	 *
	 * @return the btn levels
	 */
	public JButton getBtnLevels() {
		return btnLavels;
>>>>>>> 8193458d93fb8d20871a3536cffa0d2f536151ee
	}

}
