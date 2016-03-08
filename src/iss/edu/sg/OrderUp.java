package iss.edu.sg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class OrderUp {

	private JFrame frame;
	private JTextField textField;
	private JPanel panelMenu;
	private JPanel panelBurger;
	private JPanel panelChicken;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderUp window = new OrderUp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OrderUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelMenu = new JPanel();
		frame.getContentPane().add(panelMenu, "name_600971009731854");
		panelMenu.setLayout(null);
		panelMenu.setVisible(true);
		
		JPanel panelBurger = new JPanel();
		frame.getContentPane().add(panelBurger, "name_600973778668824");
		panelBurger.setLayout(null);
		panelBurger.setVisible(false);
		
		JPanel panelChicken = new JPanel();
		frame.getContentPane().add(panelChicken, "name_600976084642384");
		panelChicken.setLayout(null);
		panelBurger.setVisible(false);
		
		JButton btnBurgerButton = new JButton("Burger Meal");
		btnBurgerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 panelBurger.setVisible(true);
			 panelMenu.setVisible(false);
			}
		});
		btnBurgerButton.setBounds(30, 34, 101, 52);
		panelMenu.add(btnBurgerButton);
		
		JButton btnChickenButton = new JButton("Chicken Meal");
		btnChickenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelChicken.setVisible(true);
				panelMenu.setVisible(false);
			}
		});
		btnChickenButton.setBounds(172, 34, 101, 52);
		panelMenu.add(btnChickenButton);
		
		textField = new JTextField();
		textField.setBounds(54, 148, 207, 23);
		panelMenu.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("My Order");
		lblNewLabel.setBounds(110, 123, 107, 14);
		panelMenu.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(110, 198, 75, 22);
		panelMenu.add(textArea);
		
		
		
		JCheckBox chckbxBurger = new JCheckBox("Burger");
		chckbxBurger.setBounds(69, 40, 97, 23);
		panelBurger.add(chckbxBurger);
		
		JCheckBox chckbxFries = new JCheckBox("Fries");
		chckbxFries.setBounds(69, 90, 97, 23);
		panelBurger.add(chckbxFries);
		
		JCheckBox chckbxDrink = new JCheckBox("Drink");
		chckbxDrink.setBounds(69, 151, 97, 23);
		panelBurger.add(chckbxDrink);
		
		JButton btnBDoneButton = new JButton("Done");
		btnBDoneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = new String();
				if(chckbxBurger.isSelected())
				{
					s="Burger ,";
				}
				if(chckbxFries.isSelected())
				{
					s=s+"Fries ,";
				}
				if(chckbxDrink.isSelected())
				{
					s=s+"Drink";
				}
				textField.setText(s);
				panelBurger.setVisible(false);
				panelMenu.setVisible(true);
			}
		});
		btnBDoneButton.setBounds(82, 214, 89, 23);
		panelBurger.add(btnBDoneButton);
		
		
		
		JCheckBox chckbxChicken = new JCheckBox("Chicken");
		chckbxChicken.setBounds(71, 25, 99, 23);
		panelChicken.add(chckbxChicken);
		
		JCheckBox chckbxCFries = new JCheckBox("Fries");
		chckbxCFries.setBounds(71, 69, 49, 23);
		panelChicken.add(chckbxCFries);
		
		JCheckBox chckbxCDrink = new JCheckBox("Drink");
		chckbxCDrink.setBounds(71, 133, 49, 23);
		panelChicken.add(chckbxCDrink);
		
		JButton btnCDone = new JButton("Done");
		btnCDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s = new String();
				if(chckbxBurger.isSelected())
				{
					s="Burger ,";
				}
				if(chckbxCFries.isSelected())
				{
					s=s+"Fries ,";
				}
				if(chckbxCDrink.isSelected())
				{
					s=s+"Drink";
				}
				textField.setText(s);
				panelChicken.setVisible(false);
				panelMenu.setVisible(true);
			}
		});
		btnCDone.setBounds(81, 211, 57, 23);
		panelChicken.add(btnCDone);
	}
}
