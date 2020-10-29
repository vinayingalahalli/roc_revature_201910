package com.player.dao.dbutil;

public class PlayerSearchQueries {

	public static final String GETPLAYERBYID = "select  name, age, gender, teamname, contact from roc_revature.player where id=?";
	public static final String GETALLPLAYERS = "select id,name,age,gender,teamname,contact from roc_revature.player";
	public static final String GETPLAYERSBYGENDER = "select id,name,age,teamname,contact from roc_revature.player where gender=?";
}
