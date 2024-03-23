package online.game.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.game.beans.Users;
import online.game.repo.UserRepo;
import online.game.service.UsersService;

@Service
public class UserServiceImpl implements UsersService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public List<Users> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public void saveUsers(Users users) {
		this.userRepo.save(users);
	}

}
