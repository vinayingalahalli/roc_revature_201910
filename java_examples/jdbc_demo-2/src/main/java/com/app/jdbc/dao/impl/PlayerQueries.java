package com.app.jdbc.dao.impl;

public class PlayerQueries {

	public static final String INSERTPLAYER = "INSERT INTO roc_revature.player(id, name, age, gender, teamname, contact,dob) "
			+ "VALUES(?,?,?,?,?,?,?)";
	public static final String GETPLAYERBYID="select  name, age, gender, teamname, contact,dob from roc_revature.player where id=?";
}
