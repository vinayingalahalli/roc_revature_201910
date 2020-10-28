package com.app.jdbc;

import com.app.jdbc.dao.PlayerDAO;
import com.app.jdbc.dao.impl.PlayerDAOImpl;
import com.app.jdbc.exception.BusinessException;
import com.app.jdbc.model.Player;

public class JdbcDemoMain {

	public static void main(String[] args) {
	
		//Player player=new Player(106, "Fatima", "Rockers",23 ,9123467890L, "F");
		
		PlayerDAO playerDAO=new PlayerDAOImpl();
		
//		try {
//			if(playerDAO.createPlayer(player)>0) {
//				System.out.println("Player created in DB with below details");
//				System.out.println(player);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			int id=106;
			Player player=playerDAO.getPlayerById(id);
			if(player!=null) {
				System.out.println("Player found with id "+id+" details are : ");
				System.out.println(player);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

	}

}
