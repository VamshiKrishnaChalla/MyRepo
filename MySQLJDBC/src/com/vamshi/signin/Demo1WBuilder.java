package com.vamshi.signin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.TextArea;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import java.awt.ScrollPane;
import javax.swing.JRadioButton;

public class Demo1WBuilder {

	private JFrame frame;
	private JTextField tfEmail;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnOK;
	private JButton btnCancel;
	private JPasswordField tfPassword;
	private JLabel pageLabel;
	private JRadioButton loginRbtn;
	private JRadioButton SignupRbtn;
	private JLabel msgLabel;

	/**
	 * Launch the application.
	 */
	public void startApplication() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo1WBuilder window = new Demo1WBuilder();
					window.initialize();
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
//	public Demo1WBuilder() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1, 117, 110, 32, 59, 174, 116, 0};
		gridBagLayout.rowHeights = new int[]{37, 65, 41, 35, 38, 35, 38, 65, 35, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		pageLabel = new JLabel("Login or Signup");
		pageLabel.setForeground(new Color(255, 51, 51));
		pageLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_pageLabel = new GridBagConstraints();
		gbc_pageLabel.insets = new Insets(0, 0, 5, 5);
		gbc_pageLabel.gridwidth = 2;
		gbc_pageLabel.gridx = 4;
		gbc_pageLabel.gridy = 0;
		frame.getContentPane().add(pageLabel, gbc_pageLabel);
		
		loginRbtn = new JRadioButton("Login");
		loginRbtn.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_loginRbtn = new GridBagConstraints();
		gbc_loginRbtn.insets = new Insets(0, 0, 5, 5);
		gbc_loginRbtn.gridx = 2;
		gbc_loginRbtn.gridy = 2;
		frame.getContentPane().add(loginRbtn, gbc_loginRbtn);
		
		SignupRbtn = new JRadioButton("SignUp");
		SignupRbtn.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_SignupRbtn = new GridBagConstraints();
		gbc_SignupRbtn.insets = new Insets(0, 0, 5, 0);
		gbc_SignupRbtn.gridx = 6;
		gbc_SignupRbtn.gridy = 2;
		frame.getContentPane().add(SignupRbtn, gbc_SignupRbtn);
		
		lblNewLabel = new JLabel("Email");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 4;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		tfEmail = new JTextField();
		tfEmail.setHorizontalAlignment(SwingConstants.CENTER);
		tfEmail.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_tfEmail = new GridBagConstraints();
		gbc_tfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_tfEmail.gridwidth = 2;
		gbc_tfEmail.gridx = 5;
		gbc_tfEmail.gridy = 4;
		frame.getContentPane().add(tfEmail, gbc_tfEmail);
		tfEmail.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 6;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		
		btnOK = new JButton("OK");
		
		btnOK.addActionListener(new ActionListener() {
			
			PageDataVO pdo = new PageDataVO();
			public void actionPerformed(ActionEvent e) {
				pdo.setEmail(tfEmail.getText());
				pdo.setPassword(tfPassword.getPassword());
				pdo.setLoginOption(loginRbtn.isSelected());
				pdo.setSignupOption(SignupRbtn.isSelected());
				String newline = System.lineSeparator();
				
				setAllFieldsAsNull();
				
				String message = "Email: "+pdo.getEmail()+newline+" Password: "+String.valueOf(pdo.getPassword());
				
				msgLabel.setText(message);
			}
		});
				
				tfPassword = new JPasswordField();
				tfPassword.setHorizontalAlignment(SwingConstants.CENTER);
				tfPassword.setFont(new Font("Tahoma", Font.PLAIN, 26));
				GridBagConstraints gbc_tfPassword = new GridBagConstraints();
				gbc_tfPassword.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfPassword.insets = new Insets(0, 0, 5, 0);
				gbc_tfPassword.gridwidth = 2;
				gbc_tfPassword.gridx = 5;
				gbc_tfPassword.gridy = 6;
				frame.getContentPane().add(tfPassword, gbc_tfPassword);
		
				btnOK.setFont(new Font("Tahoma", Font.PLAIN, 21));
				GridBagConstraints gbc_btnOK = new GridBagConstraints();
				gbc_btnOK.insets = new Insets(0, 0, 5, 5);
				gbc_btnOK.gridx = 4;
				gbc_btnOK.gridy = 8;
				frame.getContentPane().add(btnOK, gbc_btnOK);
		
		
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAllFieldsAsNull();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 5, 0);
		gbc_btnCancel.gridx = 6;
		gbc_btnCancel.gridy = 8;
		frame.getContentPane().add(btnCancel, gbc_btnCancel);
		
		msgLabel = new JLabel("");
		msgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		msgLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GridBagConstraints gbc_msgLabel = new GridBagConstraints();
		gbc_msgLabel.gridwidth = 5;
		gbc_msgLabel.insets = new Insets(0, 0, 0, 5);
		gbc_msgLabel.gridx = 2;
		gbc_msgLabel.gridy = 10;
		frame.getContentPane().add(msgLabel, gbc_msgLabel);
	}
	
	public void setAllFieldsAsNull()
	{
		loginRbtn.setSelected(false);
		SignupRbtn.setSelected(false);
		tfEmail.setText(null);
		tfPassword.setText(null);
	}
	
	public void displayErrorMsg(String errorMsg)
	{
		msgLabel.setText(errorMsg);
		setAllFieldsAsNull();
		
	}

}
