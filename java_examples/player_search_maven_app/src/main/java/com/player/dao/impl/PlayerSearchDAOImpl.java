package com.player.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.player.dao.PlayerSearchDAO;
import com.player.dao.dbutil.PlayerSearchQueries;
import com.player.dao.dbutil.PostresSqlConnection;
import com.player.exception.BusinessException;
import com.player.model.Player;

public class PlayerSearchDAOImpl  implements PlayerSearchDAO{

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		System.out.println("IN DAO getPlayerId id = "+id);
		Player player = null;
		try (Connection connection = PostresSqlConnection.getConnection()) {
			String sql = PlayerSearchQueries.GETPLAYERBYID;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
		//	System.out.println("Query executed");
			if (resultSet.next()) {
			//	System.out.println("In IF");
				player = new Player(id, resultSet.getString("name"), resultSet.getString("teamName"),
						resultSet.getInt("age"), resultSet.getLong("contact"), resultSet.getString("gender"));
			}else {
			//	System.out.println("In else");
				throw new BusinessException("Invalid ID!!!... No matching records found for the ID = "+id);
			}
		} catch (ClassNotFoundException | SQLException e) {
		//	System.out.println("In exception");
			System.out.println(e); // take off this line when in production
			throw new BusinessException("Internal error occured.. Kindly contact SYSADMIN");
		}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		try (Connection connection = PostresSqlConnection.getConnection()) {
			String sql = PlayerSearchQueries.GETALLPLAYERS;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("teamName"),
						resultSet.getInt("age"), resultSet.getLong("contact"), resultSet.getString("gender"));
				playerList.add(player);
			}
			if(playerList.size()==0)
			{
				throw new BusinessException("No Player Records Available");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // take off this line when in production
			throw new BusinessException("Internal error occured.. Kindly contact SYSADMIN");
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player getPlayerByContactNumber(long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		try (Connection connection = PostresSqlConnection.getConnection()) {
			String sql = PlayerSearchQueries.GETPLAYERSBYGENDER;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, gender.toUpperCase());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("teamName"),
						resultSet.getInt("age"), resultSet.getLong("contact"), gender);
				playerList.add(player);
			}
			if(playerList.size()==0)
			{
				throw new BusinessException("No Players Found with Gender "+gender);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // take off this line when in production
			throw new BusinessException("Internal error occured.. Kindly contact SYSADMIN");
		}
		return playerList;
	}

}
