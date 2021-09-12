package co.netier.RestApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.netier.RestApp.domain.User;
import co.netier.RestApp.service.UserService;

@RestController
@RequestMapping("/rest")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public void save(@RequestBody User user) {
		userService.save(user);
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> list() {
		return userService.findAll();
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public User get(@PathVariable("id") long id) {
		return userService.find(id);
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") int id, @RequestBody User user) {
		userService.update(id, user);
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
		userService.delete(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
	

}
