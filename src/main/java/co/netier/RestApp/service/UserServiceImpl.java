package co.netier.RestApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.netier.RestApp.doa.UserRepository;
import co.netier.RestApp.domain.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void save(User user) {
		userRepository.save(user);
		
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User find(long id) {
		return userRepository.find(id);
	}

	@Override
	public void update(long id, User user) {
		userRepository.update(id, user);
		
	}

	@Override
	public void delete(long id) {
		userRepository.delete(id);
		
	}

}
