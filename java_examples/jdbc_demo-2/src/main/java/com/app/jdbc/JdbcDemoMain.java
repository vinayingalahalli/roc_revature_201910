package com.app.jdbc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.app.jdbc.dao.PlayerDAO;
import com.app.jdbc.dao.impl.PlayerDAOImpl;
import com.app.jdbc.exception.BusinessException;
import com.app.jdbc.model.Player;

public class JdbcDemoMain {

	public static void main(String[] args) {
	
//		Player player=new Player(107, "Kiran", "Rockers",23 ,9423467890L, "M");
//		String s="12/10/1990";
//		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
//		sdf.setLenient(false);
//		Date dob=null;
//		try {
//			dob=sdf.parse(s);
//		} catch (ParseException e1) {
//			System.out.println(e1);
//		}
//		player.setDob(dob);
//		
	PlayerDAO playerDAO=new PlayerDAOImpl();
//		
//		try {
//			if(playerDAO.createPlayer(player)>0) {
//				System.out.println("Player created in DB with below details");
//				System.out.println(player);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
//		
		try {
			int id=107;
			Player player1=playerDAO.getPlayerById(id);
			if(player1!=null) {
				System.out.println("Player found with id "+id+" details are : ");
				System.out.println(player1);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

	}

}
