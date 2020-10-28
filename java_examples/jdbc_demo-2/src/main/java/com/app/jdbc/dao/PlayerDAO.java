package com.app.jdbc.dao;

import com.app.jdbc.exception.BusinessException;
import com.app.jdbc.model.Player;

//DAO - Data Access Object
//A DAO represents that all the code which is related  to your DB or persistence or
//storage will be written inside this.
public interface PlayerDAO {

	public int createPlayer(Player player)throws BusinessException;

	public int updatePlayerContact(int id, long newContact)throws BusinessException;

	public void deletePlayer(int id)throws BusinessException;

	public Player getPlayerById(int id)throws BusinessException;
}
