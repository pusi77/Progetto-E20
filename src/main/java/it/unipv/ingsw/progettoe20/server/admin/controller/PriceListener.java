package it.unipv.ingsw.progettoe20.server.admin.controller;

import javax.swing.JOptionPane;

import it.unipv.ingsw.progettoe20.server.admin.model.PriceAdministrator;
import it.unipv.ingsw.progettoe20.server.admin.view.PriceManagementGUI;
import it.unipv.ingsw.progettoe20.server.database.DBConstants;

/**
 * Listener che che controlla le operazioni effettuate nella schermata del
 * PriceManagementGUI Modifica le tariffe disponibili
 */

public class PriceListener extends AbstractListener {

	private final PriceManagementGUI gui;
	private final PriceAdministrator admin;

	/**
	 * Crea una istanza del PriceListener.
	 *
	 * @param gui istanza di PriceManagementGUI
	 */
	public PriceListener(PriceManagementGUI gui) {
		this.gui = gui;
		admin = PriceAdministrator.getInstance();
	}

	@Override
	public void changeGUI() {
		super.changeGUI();
		gui.setVisible(false);
	}

	/**
	 * Legge la nuova tariffa inserita nel JTextField.
	 *
	 * @return price nuova tariffa inserita
	 */
	public double enteredNumber() {
		String str = gui.getField().getText();
		double price = 0.0;

		if (str.equals("")) {
			// Se non viene inserito nessun numero
			JOptionPane.showMessageDialog(null, "Please, enter the number", "Error", 1, null);
			throw new IllegalArgumentException("Impossible! Enter the number");
		}

		price = Double.parseDouble(str);
		return price;
	}

	@Override
	public void change() {
		try {
			double newprice = enteredNumber();
			String action = (String) gui.getCombo().getSelectedItem();
			int minutes;

			if (action.equals("Hourly price")) {
				// Se si vuole modificare la tariffa oraria
				minutes = DBConstants.MINUTES_HOURLY;

			} else if (action.equals("Maximum price")) {
				// Se si vuole modificare la tariffa massima
				minutes = DBConstants.MINUTES_MAXIMUM;

			} else {
				// Se si vuole modificare la tariffa minima
				minutes = DBConstants.MINUTES_MINIMUM;
			}
			// Modifica della tariffa
			admin.changePrice(newprice, minutes);
			gui.getField().setText("");
			JOptionPane.showMessageDialog(null, "Price: " + newprice + " euro", "Info", 1, null);
		} catch (IllegalArgumentException i) {
			return;
		}
	}
}
