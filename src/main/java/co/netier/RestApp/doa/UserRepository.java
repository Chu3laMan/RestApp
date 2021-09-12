package co.netier.RestApp.doa;

import java.util.List;

import co.netier.RestApp.domain.User;

public interface UserRepository {
	
	public void save(User user);
	public List<User> findAll();
	public User find(long id);
	public void update(long id, User user);
	public void delete(long id);

}
