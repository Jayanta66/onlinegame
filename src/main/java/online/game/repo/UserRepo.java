package online.game.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import online.game.beans.Users;

public interface UserRepo extends JpaRepository<Users, String> {

}
