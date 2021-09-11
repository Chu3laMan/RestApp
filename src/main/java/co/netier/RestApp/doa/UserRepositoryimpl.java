package co.netier.RestApp.doa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import co.netier.RestApp.domain.User;

@Repository
public class UserRepositoryimpl implements UserRepository {
	
	private Map<Integer, User> users = new HashMap<Integer, User>();
	
	@PostConstruct
	public void setup() {
		users.put(1, new User(1, "Houssam EL Mansouri"));
		users.put(2, new User(2, "John Doe"));
	}

	@Override
	public void save(User user) {
		users.put((int) user.getId(), user);
		
	}

	@Override
	public List<User> findAll() {
		return new ArrayList<User>(users.values());
	}

	@Override
	public User find(int id) {
		return users.get(id);
	}

	@Override
	public void update(int id, User user) {
		users.put(id, user);
		
	}

	@Override
	public void delete(int id) {
		users.remove(id);
		
	}

}
