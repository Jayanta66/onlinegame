package online.game.service;

import java.util.List;

import online.game.beans.Users;

public interface UsersService {

	List<Users>getAllUsers();
	void saveUsers(Users users);
	
	
}
