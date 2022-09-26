package com.vamshi.sampleSigninandLoginPage.pages;

import java.util.UUID;
import java.sql.SQLException;

public class CreateNewUser {

	public void updateDataToTable(NewUserDataVO nud) throws ClassNotFoundException, SQLException {
		
		String query = "INSERT INTO new_user_details values ('"
							+UUID.randomUUID().toString()+"','"
							+nud.getName()+"','"
							+nud.getRole()+"','"
							+nud.getUserName()+"','"
							+nud.getPass()+"')";
		
		SQLConnector sql = new SQLConnector();
		sql.executeUpdateQuery(query);
	}
}
