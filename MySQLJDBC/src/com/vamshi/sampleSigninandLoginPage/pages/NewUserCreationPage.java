package com.vamshi.sampleSigninandLoginPage.pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class NewUserCreationPage {

	private JFrame frame;
	private JTextField tfName;
	private JTextField tfRole;
	private JTextField tfUserName;
	private JTextField tfPass;
	private JLabel msgLabel;

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public void startApplication() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUserCreationPage window = new NewUserCreationPage();
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
		frame.setSize(new Dimension(946, 669));
		frame.setBounds(100, 100, 946, 669);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1, 98, 120, 169, 0, 322, 0};
		gridBagLayout.rowHeights = new int[]{1, 37, 80, 38, 50, 38, 50, 38, 50, 38, 40, 41, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel createUserLabel = new JLabel("Create New User");
		createUserLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_createUserLabel = new GridBagConstraints();
		gbc_createUserLabel.insets = new Insets(0, 0, 5, 0);
		gbc_createUserLabel.gridwidth = 5;
		gbc_createUserLabel.gridx = 1;
		gbc_createUserLabel.gridy = 1;
		frame.getContentPane().add(createUserLabel, gbc_createUserLabel);
		
		JLabel NameLabel = new JLabel("Name");
		NameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		NameLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_NameLabel = new GridBagConstraints();
		gbc_NameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_NameLabel.gridx = 2;
		gbc_NameLabel.gridy = 3;
		frame.getContentPane().add(NameLabel, gbc_NameLabel);
		
		tfName = new JTextField();
		tfName.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_tfName = new GridBagConstraints();
		gbc_tfName.gridwidth = 2;
		gbc_tfName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfName.insets = new Insets(0, 0, 5, 0);
		gbc_tfName.gridx = 4;
		gbc_tfName.gridy = 3;
		frame.getContentPane().add(tfName, gbc_tfName);
		tfName.setColumns(10);
		
		JLabel RoleLabel = new JLabel("Role");
		RoleLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_RoleLabel = new GridBagConstraints();
		gbc_RoleLabel.insets = new Insets(0, 0, 5, 5);
		gbc_RoleLabel.gridx = 2;
		gbc_RoleLabel.gridy = 5;
		frame.getContentPane().add(RoleLabel, gbc_RoleLabel);
		
		tfRole = new JTextField();
		tfRole.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_tfRole = new GridBagConstraints();
		gbc_tfRole.gridwidth = 2;
		gbc_tfRole.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfRole.insets = new Insets(0, 0, 5, 0);
		gbc_tfRole.gridx = 4;
		gbc_tfRole.gridy = 5;
		frame.getContentPane().add(tfRole, gbc_tfRole);
		tfRole.setColumns(10);
		
		JLabel UserNameLabel = new JLabel("UserName");
		UserNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_UserNameLabel = new GridBagConstraints();
		gbc_UserNameLabel.anchor = GridBagConstraints.EAST;
		gbc_UserNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_UserNameLabel.gridx = 2;
		gbc_UserNameLabel.gridy = 7;
		frame.getContentPane().add(UserNameLabel, gbc_UserNameLabel);
		
		tfUserName = new JTextField();
		tfUserName.setFont(new Font("Tahoma", Font.PLAIN, 26));
		tfUserName.setColumns(10);
		GridBagConstraints gbc_tfUserName = new GridBagConstraints();
		gbc_tfUserName.gridwidth = 2;
		gbc_tfUserName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfUserName.insets = new Insets(0, 0, 5, 0);
		gbc_tfUserName.gridx = 4;
		gbc_tfUserName.gridy = 7;
		frame.getContentPane().add(tfUserName, gbc_tfUserName);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_PasswordLabel = new GridBagConstraints();
		gbc_PasswordLabel.anchor = GridBagConstraints.EAST;
		gbc_PasswordLabel.insets = new Insets(0, 0, 5, 5);
		gbc_PasswordLabel.gridx = 2;
		gbc_PasswordLabel.gridy = 9;
		frame.getContentPane().add(PasswordLabel, gbc_PasswordLabel);
		
		tfPass = new JTextField();
		tfPass.setFont(new Font("Tahoma", Font.PLAIN, 26));
		tfPass.setColumns(10);
		GridBagConstraints gbc_tfPass = new GridBagConstraints();
		gbc_tfPass.gridwidth = 2;
		gbc_tfPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPass.insets = new Insets(0, 0, 5, 0);
		gbc_tfPass.gridx = 4;
		gbc_tfPass.gridy = 9;
		frame.getContentPane().add(tfPass, gbc_tfPass);
		
		
		JButton createUserBtn = new JButton("Create User");
		createUserBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msgLabel.setText("");
				if(tfName.getText()!=null&&
					tfRole.getText()!=null&&
					tfUserName.getText()!=null&&
					tfPass.getText()!=null) {
					
					try {
						boolean flag = intializeNewUserDataVO(tfName.getText(), tfRole.getText(), 
								tfUserName.getText(), tfPass.getText());
						if(flag)
							msgLabel.setText("User Account "+tfUserName.getText()+" is created");
						else
							msgLabel.setText("User Account "+tfUserName.getText()+" is already registered. Please try witn new userName");
						
					} 
					catch (ClassNotFoundException | SQLException e1) {
						
						e1.printStackTrace();
					}
					

				}
			}
		});
		createUserBtn.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_createUserBtn = new GridBagConstraints();
		gbc_createUserBtn.insets = new Insets(0, 0, 5, 5);
		gbc_createUserBtn.gridx = 2;
		gbc_createUserBtn.gridy = 11;
		frame.getContentPane().add(createUserBtn, gbc_createUserBtn);
		
		JButton backBtn = new JButton("Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		backBtn.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_backBtn = new GridBagConstraints();
		gbc_backBtn.insets = new Insets(0, 0, 5, 0);
		gbc_backBtn.gridx = 5;
		gbc_backBtn.gridy = 11;
		frame.getContentPane().add(backBtn, gbc_backBtn);
		
		msgLabel = new JLabel("");
		msgLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_msgLabel = new GridBagConstraints();
		gbc_msgLabel.gridwidth = 6;
		gbc_msgLabel.insets = new Insets(0, 0, 0, 5);
		gbc_msgLabel.gridx = 0;
		gbc_msgLabel.gridy = 12;
		frame.getContentPane().add(msgLabel, gbc_msgLabel);
		
		
	}
	public boolean intializeNewUserDataVO(String name, String role, String userName, String password) throws ClassNotFoundException, SQLException {
		NewUserDataVO nud = new NewUserDataVO(name,role,userName,password);
		CreateNewUser cnu = new CreateNewUser();
		DataValidator val = new DataValidator(userName);
		if(val.isUserNameValid())
		{
			cnu.updateDataToTable(nud);
			return false;
		}
		else
			return true;
			
	}
	
}
