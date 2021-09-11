package co.netier.RestApp.doa;

import java.util.List;

import co.netier.RestApp.domain.User;

public interface UserRepository {
	
	public void save(User user);
	public List<User> findAll();
	public User find(int id);
	public void update(int id, User user);
	public void delete(int id);

}
