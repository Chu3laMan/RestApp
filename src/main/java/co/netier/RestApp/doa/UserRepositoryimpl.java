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
	
	private Map<Long, User> users = new HashMap<Long, User>();
	
	@PostConstruct
	public void setup() {
		users.put((long) 1, new User(1, "Houssam EL Mansouri"));
		users.put((long) 2, new User(2, "John Doe"));
	}

	@Override
	public void save(User user) {
		users.put(user.getId(), user);
		
	}

	@Override
	public List<User> findAll() {
		return new ArrayList<User>(users.values());
	}

	@Override
	public User find(long id) {
		return users.get(id);
	}

	@Override
	public void update(long id, User user) {
		users.put(id, user);
		
	}

	@Override
	public void delete(long id) {
		users.remove(id);
		
	}

}
