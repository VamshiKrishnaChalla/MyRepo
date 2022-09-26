package com.vamshi.sampleSigninandLoginPage.pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class ApplicationPage {

	private JFrame frame;
	private JTextField tfUserName;
	private JTextField tfPass;
	private JButton btnOK;
	private JButton btnCancel;
	private JButton btnExit;
	private JLabel displayLabel;
	private JButton newAccountCreateBtn;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void startApplication(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationPage window = new ApplicationPage();
					window.initialize();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void initialize() {
		frame = new JFrame();
		frame.setSize(new Dimension(800, 542));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1, 101, 134, 123, 45, 0, 80, 126, 126, 0};
		gridBagLayout.rowHeights = new int[]{37, 120, 38, 45, 38, 45, 41, 41, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel PageLabel = new JLabel("Welcome to Login and Signup Page");
		PageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PageLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_PageLabel = new GridBagConstraints();
		gbc_PageLabel.insets = new Insets(0, 0, 5, 0);
		gbc_PageLabel.gridwidth = 8;
		gbc_PageLabel.gridx = 1;
		gbc_PageLabel.gridy = 0;
		frame.getContentPane().add(PageLabel, gbc_PageLabel);
		
		JLabel UserNameLabel = new JLabel("User Name");
		UserNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		UserNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_UserNameLabel = new GridBagConstraints();
		gbc_UserNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_UserNameLabel.gridx = 2;
		gbc_UserNameLabel.gridy = 2;
		frame.getContentPane().add(UserNameLabel, gbc_UserNameLabel);
		
		tfUserName = new JTextField();
		tfUserName.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_tfUserName = new GridBagConstraints();
		gbc_tfUserName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfUserName.insets = new Insets(0, 0, 5, 5);
		gbc_tfUserName.gridwidth = 4;
		gbc_tfUserName.gridx = 4;
		gbc_tfUserName.gridy = 2;
		frame.getContentPane().add(tfUserName, gbc_tfUserName);
		tfUserName.setColumns(10);
		
		JLabel PassLabel = new JLabel("Password");
		PassLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PassLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_PassLabel = new GridBagConstraints();
		gbc_PassLabel.insets = new Insets(0, 0, 5, 5);
		gbc_PassLabel.gridx = 2;
		gbc_PassLabel.gridy = 4;
		frame.getContentPane().add(PassLabel, gbc_PassLabel);
		
		tfPass = new JTextField();
		tfPass.setFont(new Font("Tahoma", Font.PLAIN, 26));
		tfPass.setColumns(10);
		GridBagConstraints gbc_tfPass = new GridBagConstraints();
		gbc_tfPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPass.insets = new Insets(0, 0, 5, 5);
		gbc_tfPass.gridwidth = 4;
		gbc_tfPass.gridx = 4;
		gbc_tfPass.gridy = 4;
		frame.getContentPane().add(tfPass, gbc_tfPass);
		
		btnOK = new JButton("OK");
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					createPDO(tfUserName.getText(),tfPass.getText());
				} 
				catch (ClassNotFoundException e1) {
					
					e1.printStackTrace();
				} 
				catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				displayLabel.setText(DriverCode.msg);
				setAllFieldsAsNull();
			}
		});
		GridBagConstraints gbc_btnOK = new GridBagConstraints();
		gbc_btnOK.anchor = GridBagConstraints.EAST;
		gbc_btnOK.insets = new Insets(0, 0, 5, 5);
		gbc_btnOK.gridx = 2;
		gbc_btnOK.gridy = 6;
		frame.getContentPane().add(btnOK, gbc_btnOK);
		
		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.insets = new Insets(0, 0, 5, 5);
		gbc_btnExit.gridx = 3;
		gbc_btnExit.gridy = 6;
		frame.getContentPane().add(btnExit, gbc_btnExit);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAllFieldsAsNull();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 4;
		gbc_btnCancel.gridy = 6;
		frame.getContentPane().add(btnCancel, gbc_btnCancel);
		
		newAccountCreateBtn = new JButton("Create Account");
		newAccountCreateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewUserCreationPage app = new NewUserCreationPage();
				app.startApplication();
			}
		});
		newAccountCreateBtn.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_newAccountCreateBtn = new GridBagConstraints();
		gbc_newAccountCreateBtn.insets = new Insets(0, 0, 5, 5);
		gbc_newAccountCreateBtn.gridx = 6;
		gbc_newAccountCreateBtn.gridy = 6;
		frame.getContentPane().add(newAccountCreateBtn, gbc_newAccountCreateBtn);
		
		displayLabel = new JLabel("");
		displayLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_displayLabel = new GridBagConstraints();
		gbc_displayLabel.gridwidth = 6;
		gbc_displayLabel.gridheight = 3;
		gbc_displayLabel.insets = new Insets(0, 0, 0, 5);
		gbc_displayLabel.gridx = 2;
		gbc_displayLabel.gridy = 7;
		frame.getContentPane().add(displayLabel, gbc_displayLabel);
	}

	public void setAllFieldsAsNull()
	{
		tfUserName.setText(null);
		tfPass.setText(null);
	}
	private void createPDO(String userName, String Pass) throws ClassNotFoundException, SQLException {
		
		LoginPageDataVO pdo = new LoginPageDataVO();
		pdo.setUserName(userName);
		pdo.setPass(Pass);	
		new DriverCode(pdo);
	}
}
